package org.example.design_patterns.adapter;

public interface StripePayment {
    void executePayment(String correlationId);
}
