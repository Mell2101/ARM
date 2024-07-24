package com.example.creditmanager.dto;

public class LoanDecision {
    private String status;
    private double approvedLoanAmount;
    private int loanTerm;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }
}
