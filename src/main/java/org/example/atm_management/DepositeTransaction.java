package org.example.atm_management;

import java.math.BigDecimal;

public class DepositeTransaction extends Transaction{
    public DepositeTransaction(String transactionId, Account account, BigDecimal amount) {
        super(transactionId, account, amount);
    }

    @Override
    public void execute() {
        account.credit(amount);
    }
}
