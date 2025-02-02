package org.example.atm_management;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService {

    private final Map<String,Account> accountMap= new ConcurrentHashMap<>();

    public void createAccount(String accountNumber, BigDecimal initialBalance){
        accountMap.put(accountNumber,new Account(accountNumber,initialBalance));
    }
    public Account getAccount(String accountNumber){
        return accountMap.get(accountNumber);
    }
    public void processTransaction(Transaction transaction){
        transaction.execute();
    }
}
