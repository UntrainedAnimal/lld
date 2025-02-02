package org.example.flight_management.payment;

public enum PaymentProcessor {
    INSTANCE;

    public void processPayment(Payment payment){
        payment.processPayment();;
    }
}
