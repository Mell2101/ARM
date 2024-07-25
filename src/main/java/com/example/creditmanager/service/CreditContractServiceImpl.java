package com.example.creditmanager.service;

import com.example.creditmanager.dao.CreditContractDao;
import com.example.creditmanager.model.CreditContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
@Service
public class CreditContractServiceImpl implements CreditContractService{
    @Autowired
    private CreditContractDao creditContractDao;

    @Override
    @Transactional
    public void createCreditContract(CreditContract contract) {
        creditContractDao.save(contract);
    }

    @Override
    @Transactional
    public void signCreditContract(Long contractId) {
        CreditContract contract = creditContractDao.getById(contractId);
        if (contract != null ) {
            contract.setSigned(true);
            contract.setSigningDate(new Date());
            creditContractDao.save(contract);
        }
    }

    @Override
    public CreditContract findById(Long contractId) {
        return creditContractDao.getById(contractId);
    }

    
}
