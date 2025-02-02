package org.example.flight_management.payment;

import org.example.flight_management.Constants.PaymentStatus;

import java.math.BigDecimal;



public class Payment {

    private final String paymentId;
    private final BigDecimal amount;
    private final String paymentMode;
    private PaymentStatus status;

    public Payment(String paymentId,String paymentMode,BigDecimal amount){
        this.paymentMode = paymentMode;
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    public void processPayment(){
        status = PaymentStatus.COMPLETED;
    }
}
