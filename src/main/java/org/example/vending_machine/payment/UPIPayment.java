package org.example.vending_machine.payment;

public class UPIPayment implements PaymentStrategy {
    private final String phoneNumber;

    public UPIPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount "+amount+" is received via upi payment");
    }
}
