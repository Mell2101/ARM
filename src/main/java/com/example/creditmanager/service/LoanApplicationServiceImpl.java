package com.example.creditmanager.service;

import com.example.creditmanager.dao.LoanApplicationDao;
import com.example.creditmanager.model.LoanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationServiceImpl {
    @Autowired
    private LoanApplicationDao loanApplicationDao;

    public void saveApplication(LoanApplication application) {
        loanApplicationDao.save(application);
    }

    public LoanApplication getApplicationById(Long id) {
        return loanApplicationDao.getById(id);
    }
}
