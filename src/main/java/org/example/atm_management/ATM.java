package org.example.atm_management;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class ATM {

    private final CashDispenser cashDispenser;
    private static final AtomicLong transactionCounter= new AtomicLong(0);
    private final BankingService bankingService;

    public ATM(CashDispenser cashDispenser, BankingService bankingService) {
        this.cashDispenser = cashDispenser;
        this.bankingService = bankingService;
    }

    public void authenticateUser(Card card){
        //authenticate mechanism
    }

    public BigDecimal checkBalance(String accountNumber){
        Account account = bankingService.getAccount(accountNumber);
        return account.getAmount();
    }

    public void withdrawCash(String accountNumber,BigDecimal amount){
        Account account = bankingService.getAccount(accountNumber);

        if (!Objects.isNull(account) && account.getAmount().compareTo(amount) < 0){
            System.out.println("Insuffice Balance");
            return;
        }
        Transaction transaction = new WithdrawalTransaction(getTransactionId(),account,amount);
        bankingService.processTransaction(transaction);
        cashDispenser.dispenseCash(amount);
    }
    public void depositeCash(String accountNumber,BigDecimal amount){
        Account account = bankingService.getAccount(accountNumber);
        Transaction transaction = new DepositeTransaction(getTransactionId(),account,amount);
        bankingService.processTransaction(transaction);
    }
    private String getTransactionId() {
        // Generate a unique transaction ID
        long transactionNumber = transactionCounter.incrementAndGet();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        return "TXN" + timestamp + String.format("%010d", transactionNumber);
    }
}
