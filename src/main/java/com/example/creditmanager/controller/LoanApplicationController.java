package com.example.creditmanager.controller;

import com.example.creditmanager.model.LoanApplication;
import com.example.creditmanager.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoanApplicationController {
    @Autowired
    private LoanApplicationService loanApplicationService;

    @GetMapping("/apply")
    public String showApplicationForm() {
        return "loanApplication";
    }

    @PostMapping("/submitApplication")
    public String submitApplication(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("middleName") String middleName,
            @RequestParam("passport") String passport,
            @RequestParam("maritalStatus") String maritalStatus,
            @RequestParam("address") String address,
            @RequestParam("contactPhone") String contactPhone,
            @RequestParam("employmentPeriod") String employmentPeriod,
            @RequestParam("position") String position,
            @RequestParam("organization") String organization,
            @RequestParam("loanAmount") double loanAmount) {

        LoanApplication application = new LoanApplication();
        application.setFirstName(firstName);
        application.setLastName(lastName);
        application.setMiddleName(middleName);
        application.setPassport(passport);
        application.setMaritalStatus(maritalStatus);
        application.setAddress(address);
        application.setContactPhone(contactPhone);
        application.setEmploymentPeriod(employmentPeriod);
        application.setPosition(position);
        application.setOrganization(organization);
        application.setLoanAmount(loanAmount);

        loanApplicationService.saveApplication(application);

        return "applicationSuccess";
    }

}
