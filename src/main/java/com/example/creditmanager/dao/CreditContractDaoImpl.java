package com.example.creditmanager.dao;

import com.example.creditmanager.model.CreditContract;
import com.example.creditmanager.model.LoanApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditContractDaoImpl implements CreditContractDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(CreditContract contract) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(contract);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<CreditContract> getAll() {
        Session session = sessionFactory.openSession();
        List<CreditContract> contracts = null;
        try {
            contracts = session.createQuery("from CreditContract", CreditContract.class).list();
        } finally {
            session.close();
        }
        return contracts;
    }

    @Override
    public void update(CreditContract contract) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(contract);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            CreditContract contract = session.get(CreditContract.class, id);
            if (contract != null) {
                session.delete(contract);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


    @Override
    public CreditContract getById(Long id) {
        Session session = sessionFactory.openSession();
        CreditContract contract = null;
        try {
            contract = session.get(CreditContract.class, id);
        } finally {
            session.close();
        }
        return contract;
    }

    @Override
    public List<CreditContract> getBySigned(Boolean signed) {
        Session session = sessionFactory.openSession();
        List<CreditContract> credit = null;
        try {
            String hql = "FROM CreditContract WHERE signed = :signed";
            credit = session.createQuery(hql, CreditContract.class)
                    .setParameter("signed", signed)
                    .list();
        } finally {
            session.close();
        }
        return credit;
    }
}
