package org.example.design_patterns.strategy;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Items item1 = new Items("101", BigDecimal.valueOf(10000));
        Items item2 = new Items("102", BigDecimal.valueOf(2000));


        Cart cart = new Cart();
        cart.addItem(item1);
        cart.addItem(item2);


        cart.pay(new UpiStrategy("samar@upi.com"));
        cart.pay(new CardStrategy("1234","Samarjit","249","3013820"));
    }

}
