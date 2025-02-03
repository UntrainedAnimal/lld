package org.example.design_patterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpiStrategy implements PaymentStrategy{

    private String upiId;


    @Override
    public void pay(BigDecimal amount) {
        System.out.println("payment is done through upi of amount "+ amount);
    }
}
