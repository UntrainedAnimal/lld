package org.example.atm_management;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Account {
    private final String accountNumber;
    private BigDecimal amount;

    public Account(String accountNumber, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void debit(BigDecimal amount){
        this.amount = this.amount.subtract(amount);
    }
    public void credit(BigDecimal amount){
        this.amount = this.amount.add(amount);
    }

}
