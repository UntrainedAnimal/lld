package org.example.design_patterns.adapter;

public class CardPayment implements PaymentMode{


    @Override
    public void pay() {
        System.out.println("payment is done via old card payment mode");
    }
}
