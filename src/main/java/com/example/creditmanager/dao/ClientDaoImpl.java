package com.example.creditmanager.dao;

import com.example.creditmanager.model.Client;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Client").list();
    }

    // Implement other CRUD methods if needed
}
