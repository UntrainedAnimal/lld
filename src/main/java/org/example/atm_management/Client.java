package org.example.atm_management;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService();
        CashDispenser cashDispenser = new CashDispenser(BigDecimal.valueOf(1000000));

        ATM atm = new ATM(cashDispenser,bankingService);

        bankingService.createAccount("1234", BigDecimal.valueOf(1000.00));
        bankingService.createAccount("1235", BigDecimal.valueOf(500.00));

        Card card = new Card("12340","1234");
        atm.authenticateUser(card);

        BigDecimal balance = atm.checkBalance("1234");
        System.out.println("Account balance : "+balance);

        atm.depositeCash("1234",BigDecimal.valueOf(600));
        System.out.println("Account balance : "+atm.checkBalance("1234"));

        atm.withdrawCash("1234",BigDecimal.valueOf(1500));
        atm.withdrawCash("1234",BigDecimal.valueOf(500));

        System.out.println("Account Balance : "+atm.checkBalance("1234"));
    }




}
