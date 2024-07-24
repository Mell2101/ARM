package com.example.creditmanager.service;

import com.example.creditmanager.dao.LoanApplicationDao;
import com.example.creditmanager.model.LoanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public interface LoanApplicationService {

    public void saveApplication(LoanApplication application);
    public LoanApplication getApplicationById(Long id);
}
