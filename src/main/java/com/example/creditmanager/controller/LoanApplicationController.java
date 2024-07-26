package com.example.creditmanager.controller;

import com.example.creditmanager.dto.LoanDecision;
import com.example.creditmanager.model.CreditContract;
import com.example.creditmanager.model.LoanApplication;
import com.example.creditmanager.service.CreditContractService;
import com.example.creditmanager.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

@Controller
public class LoanApplicationController {
    @Autowired
    private LoanApplicationService loanApplicationService;

    @Autowired
    private CreditContractService creditContractService;

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
            @RequestParam("loanAmount") double loanAmount,
            Model model) {

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


        LoanDecision decision = determineLoanDecision();
        application.setStatus(decision.getStatus());
        application.setApprovedLoanAmount(decision.getApprovedLoanAmount());
        application.setLoanTerm(decision.getLoanTerm());


        loanApplicationService.updateApplication(application);

        model.addAttribute("application", application);

        if ("Approved".equals(application.getStatus())) {
            CreditContract contract = new CreditContract();
            contract.setLoanApplication(application);
            contract.setSigned(false);
            creditContractService.createCreditContract(contract);
            model.addAttribute("contractId", contract.getId());
        }

        return "applicationSuccess";
    }



    private LoanDecision determineLoanDecision() {
        Random random = new Random();
        boolean isApproved = random.nextBoolean();
        int loanTerm = random.nextInt(365 * 12) + 1;
        double approvedAmount = isApproved ? random.nextDouble() * 100000 : 0;

        LoanDecision decision = new LoanDecision();
        decision.setStatus(isApproved ? "Approved" : "Not Approved");
        decision.setApprovedLoanAmount(approvedAmount);
        decision.setLoanTerm(loanTerm);

        return decision;
    }

    @GetMapping("/applicationsByStatus")
    public String applicationsByStatus(
            @RequestParam(value = "status", required = false) String status,
            Model model) {

        List<LoanApplication> applications;
        if (status != null && !status.isEmpty()) {
            applications = loanApplicationService.getApplicationsByStatus(status);
        } else {
            applications = loanApplicationService.getAllLoanApplications();
        }

        model.addAttribute("applications", applications);
        return "clientList";
    }

}
