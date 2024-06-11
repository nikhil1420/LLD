package dev.nikhil.machinecoding.parkinglot.models;

import dev.nikhil.machinecoding.parkinglot.enums.PaymentMode;
import dev.nikhil.machinecoding.parkinglot.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel {

    private PaymentMode paymentMode;
    private Float amount;
    private String transactionRefNumber;
    private LocalDateTime paymentTime;
    private PaymentStatus paymentStatus;
    private Bill bill;

    public Payment() {
    }

    public Payment(PaymentMode paymentMode, Float amount, String transactionRefNumber, LocalDateTime paymentTime, PaymentStatus paymentStatus, Bill bill) {
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.transactionRefNumber = transactionRefNumber;
        this.paymentTime = paymentTime;
        this.paymentStatus = paymentStatus;
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getTransactionRefNumber() {
        return transactionRefNumber;
    }

    public void setTransactionRefNumber(String transactionRefNumber) {
        this.transactionRefNumber = transactionRefNumber;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
