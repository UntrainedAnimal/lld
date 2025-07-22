package org.example.design_patterns.adapter;

public class Client {
    public static void main(String[] args) {
        PaymentMode mode = new CardPayment();

        mode.pay();

        StripePayment newMode = new StripePaymentImpl();
       // newMode.executePayment("382982");
        PaymentMode adapterMode = new StripePaymentAdapter(newMode);
        adapterMode.pay();

    }
}
