package com.example.creditmanager.service;

import com.example.creditmanager.dao.LoanApplicationDao;
import com.example.creditmanager.model.LoanApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private LoanApplicationDao loanApplicationDao;

    @Override
    public void saveApplication(LoanApplication application) {
        loanApplicationDao.save(application);
    }

    @Override
    public LoanApplication getApplicationById(Long id) {
        return loanApplicationDao.getById(id);
    }

    @Transactional
    @Override
    public void updateApplication(LoanApplication application) {
        loanApplicationDao.update(application);
    }

    @Transactional
    @Override
    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationDao.getAll();
    }

    @Transactional
    @Override
    public List<LoanApplication> search(String phone, String firstName, String lastName, String passport) {
        return loanApplicationDao.search(phone, firstName, lastName, passport);
    }

    public List<LoanApplication> getApplicationsByStatus(String status) {
        return loanApplicationDao.getByStatus(status);
    }
}
