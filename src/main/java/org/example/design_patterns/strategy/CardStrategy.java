package org.example.design_patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardStrategy implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;
    String cvv;
    String expiry;

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Payment is made through credit card of amount "+amount);
    }
}
