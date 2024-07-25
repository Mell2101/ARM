package com.example.creditmanager.dao;

import com.example.creditmanager.model.CreditContract;

import java.util.List;


public interface CreditContractDao {
    void save(CreditContract credit);

    CreditContract getById(Long id);
    List<CreditContract> getAll();
    void update(CreditContract contract);
    void delete(Long id);


}
