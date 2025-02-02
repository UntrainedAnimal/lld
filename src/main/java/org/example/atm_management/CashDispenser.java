package org.example.atm_management;

import java.math.BigDecimal;

public class CashDispenser {
    private static BigDecimal cashAvailable;

    public CashDispenser(BigDecimal initialCash){
        cashAvailable = initialCash;
    }

    public synchronized void dispenseCash(BigDecimal amount){
        if(amount.compareTo(cashAvailable)>0)
        {
            throw new IllegalArgumentException("Insufficent Cash availalbe in the ATM");
        }
        cashAvailable = cashAvailable.subtract(amount);
        System.out.println("cash dispensed: "+amount);
    }
}
