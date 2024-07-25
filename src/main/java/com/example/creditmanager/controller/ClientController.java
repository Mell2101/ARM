package com.example.creditmanager.controller;

import com.example.creditmanager.model.LoanApplication;
import com.example.creditmanager.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private LoanApplicationService loanApplicationService;

    @GetMapping("/clients")
    public String listClients(Model model) {
        List<LoanApplication> applications = loanApplicationService.getAllLoanApplications();
        model.addAttribute("applications", applications);
        return "clientList";
    }


}
