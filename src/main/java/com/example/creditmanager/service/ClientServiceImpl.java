package com.example.creditmanager.service;

import com.example.creditmanager.model.Client;
import com.example.creditmanager.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Client> getAllClients() {
        return clientDao.findAll();
    }
}
