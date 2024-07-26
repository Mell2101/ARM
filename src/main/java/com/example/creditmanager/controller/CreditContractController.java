package com.example.creditmanager.controller;

import com.example.creditmanager.model.CreditContract;
import com.example.creditmanager.service.CreditContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CreditContractController {

    @Autowired
    private CreditContractService creditContractService;


    @PostMapping("/signContract")
    public String signContract(
            @RequestParam(value = "contractId", required = false) Long contractId, Model model) {
        try {

            if (contractId == null) {
                model.addAttribute("error", "Contract ID is missing.");
                return "errorPage";
            }

            creditContractService.signCreditContract(contractId);

            CreditContract contract = creditContractService.findById(contractId);
            if (contract == null) {
                model.addAttribute("error", "Contract not found.");
                return "errorPage";
            }

            model.addAttribute("contract", contract);

            return "contractSigned";
        } catch (Exception e) {

            model.addAttribute("error", "An error occurred: " + e.getMessage());
            return "errorPage";
        }
    }

    @GetMapping("/creditContractBySigned")
    public String applicationsByStatus(
            @RequestParam(value = "signed", required = false) Boolean signed,
            Model model) {

        List<CreditContract> contracts;
        if (signed ) {
            contracts = creditContractService.getCreditBySigned(signed);
        }
        else {
            contracts = creditContractService.getAllCreditContract();
        }

        model.addAttribute("contracts", contracts);
        return "creditContractList";
    }


}
