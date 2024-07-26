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

    @GetMapping("/")
    public String home(Model model) {

        return "home";
    }

    @GetMapping("/clients")
    public String listClients(Model model) {
        List<LoanApplication> applications = loanApplicationService.getAllLoanApplications();
        model.addAttribute("applications", applications);
        return "clientList";
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "firstName", required = false) String firstName,
            @RequestParam(value = "lastName", required = false) String lastName,
            @RequestParam(value = "passport", required = false) String passport,
            Model model) {

        List<LoanApplication> results = loanApplicationService.search(phone, firstName, lastName, passport);
        model.addAttribute("applications", results);
        return "clientList"; // Название JSP страницы для отображения результатов поиска
    }
}
