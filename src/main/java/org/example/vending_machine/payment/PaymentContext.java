package org.example.vending_machine.payment;

public class PaymentContext {
    private final PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void payAmount(double amount){
        if(paymentStrategy==null){
            throw new IllegalStateException("payment mode is not set");
        }
        paymentStrategy.pay(amount);
    }
}
