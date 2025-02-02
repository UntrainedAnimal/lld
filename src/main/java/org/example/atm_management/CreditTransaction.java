package org.example.atm_management;

import java.math.BigDecimal;

public class CreditTransaction extends Transaction{
    public CreditTransaction(String transactionId, Account account, BigDecimal amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.credit(amount);
    }
}
