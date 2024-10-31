package com.pluralsight.car;

public class SalesContract extends Contract{
    double salesTaxAmount;
    double recordingFee;
    double processingFee;
    boolean finance;

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    double monthlyPayment;


    public SalesContract(String date, String customerName, String customerEmail, boolean vehicleSold, double monthlyPayment, boolean finance, double processingFee, double recordingFee, double salesTaxAmount) {
        super(date, customerName, customerEmail, vehicleSold);
        this.monthlyPayment = monthlyPayment;
        this.finance = finance;
        this.processingFee = processingFee;
        this.recordingFee = recordingFee;
        this.salesTaxAmount = salesTaxAmount;
    }
}
