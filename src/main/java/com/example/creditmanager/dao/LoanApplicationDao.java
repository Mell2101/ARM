package com.example.creditmanager.dao;

import com.example.creditmanager.model.LoanApplication;
import java.util.List;
public interface LoanApplicationDao {
    void save(LoanApplication application);
    LoanApplication getById(Long id);
    List<LoanApplication> getAll();
    void update(LoanApplication application);
    void delete(Long id);

}
