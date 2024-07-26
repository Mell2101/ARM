package com.example.creditmanager.dao;

import com.example.creditmanager.dao.LoanApplicationDao;
import com.example.creditmanager.model.LoanApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoanApplicationDaoImpl implements LoanApplicationDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(LoanApplication application) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(application);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public LoanApplication getById(Long id) {
        Session session = sessionFactory.openSession();
        LoanApplication application = null;
        try {
            application = session.get(LoanApplication.class, id);
        } finally {
            session.close();
        }
        return application;
    }

    @Override
    public List<LoanApplication> getAll() {
        Session session = sessionFactory.openSession();
        List<LoanApplication> applications = null;
        try {
            applications = session.createQuery(
                    "select distinct la from LoanApplication la left join fetch la.contract", LoanApplication.class).list();
        } finally {
            session.close();
        }
        return applications;
    }

    @Override
    public void update(LoanApplication application) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(application);
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
            LoanApplication application = session.get(LoanApplication.class, id);
            if (application != null) {
                session.delete(application);
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
    public List<LoanApplication> search(String phone, String firstName, String lastName, String passport) {
        Session session = sessionFactory.openSession();
        List<LoanApplication> applications = null;
        try {
            String queryStr = "from LoanApplication where 1=1";
            if (firstName != null && !firstName.isEmpty()) {
                queryStr += " and firstName = :firstName";
            }
            if (lastName != null && !lastName.isEmpty()) {
                queryStr += " and lastName = :lastName";
            }
            if (phone != null && !phone.isEmpty()) {
                queryStr += " and contactPhone = :phone";
            }
            if (passport != null && !passport.isEmpty()) {
                queryStr += " and passport = :passport";
            }

            Query<LoanApplication> query = session.createQuery(queryStr, LoanApplication.class);

            if (firstName != null && !firstName.isEmpty()) {
                query.setParameter("firstName", firstName);
            }
            if (lastName != null && !lastName.isEmpty()) {
                query.setParameter("lastName", lastName);
            }
            if (phone != null && !phone.isEmpty()) {
                query.setParameter("phone", phone);
            }
            if (passport != null && !passport.isEmpty()) {
                query.setParameter("passport", passport);
            }

            applications = query.list();
        } finally {
            session.close();
        }
        return applications;
    }
}