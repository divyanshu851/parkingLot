package parkingLot.models;

import parkingLot.enums.PaymentMode;
import parkingLot.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private double amount;
    private PaymentMode paymentMode;
    private Bill bill;

    private String transactionRefNumber;

    private PaymentStatus paymentStatus;

    private LocalDateTime paymentTime;

    public Payment(){

    }
    public Payment(double amount, PaymentMode paymentMode, Bill bill, String transactionRefNumber, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.transactionRefNumber = transactionRefNumber;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getTransactionRefNumber() {
        return transactionRefNumber;
    }

    public void setTransactionRefNumber(String transactionRefNumber) {
        this.transactionRefNumber = transactionRefNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
