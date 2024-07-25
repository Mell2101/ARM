package com.example.creditmanager.service;

import com.example.creditmanager.model.CreditContract;

public interface CreditContractService {
    void createCreditContract(CreditContract contract);
    void signCreditContract(Long contractId);
    CreditContract findById(Long contractId);
}
