package com.example.creditmanager.service;

import com.example.creditmanager.model.CreditContract;

import java.util.List;

public interface CreditContractService {
    void createCreditContract(CreditContract contract);
    void signCreditContract(Long contractId);
    CreditContract findById(Long contractId);
    public List<CreditContract> getCreditBySigned(Boolean signed);
    public List<CreditContract> getAllCreditContract();
}
