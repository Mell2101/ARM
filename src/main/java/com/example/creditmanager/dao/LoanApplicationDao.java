package com.example.creditmanager.dao;

import com.example.creditmanager.model.LoanApplication;
import java.util.List;
public interface LoanApplicationDao {
    void save(LoanApplication application);
    LoanApplication getById(Long id);
    List<LoanApplication> getAll();
    void update(LoanApplication application);
    void delete(Long id);
    public List<LoanApplication> search(String phone, String firstName, String lastName, String passport);
    public List<LoanApplication> getByStatus(String status);
}
