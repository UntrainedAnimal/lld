package org.example.design_patterns.adapter;

public class StripePaymentImpl implements StripePayment{
    @Override
    public void executePayment(String correlationId) {
        System.out.println("paid via new futuristic stripe payment with id "+ correlationId);
    }
}
