package org.example.design_patterns.adapter;

import java.util.UUID;

public class StripePaymentAdapter implements PaymentMode{

    final StripePayment stripePayment;

    public StripePaymentAdapter(StripePayment StripePaymentImpl) {
        this.stripePayment = StripePaymentImpl;
    }

    @Override
    public void pay() {
        String correlationId =  UUID.randomUUID().toString();
        stripePayment.executePayment(correlationId);

    }
}
