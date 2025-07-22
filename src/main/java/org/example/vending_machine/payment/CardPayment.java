package org.example.vending_machine.payment;

import lombok.AllArgsConstructor;


public class CardPayment implements PaymentStrategy{
    private final String cardNumber;
    private final String otp;

    public CardPayment(String cardNumber, String otp) {
        this.cardNumber = cardNumber;
        this.otp = otp;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount "+amount+" is received via card payment");
    }
}
