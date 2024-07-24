package com.example.creditmanager.dao;

import com.example.creditmanager.model.Client;
import java.util.List;

public interface ClientDao {
    List<Client> findAll();
    // Add other CRUD methods if needed
}
