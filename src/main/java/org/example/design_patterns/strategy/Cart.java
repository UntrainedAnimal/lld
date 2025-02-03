package org.example.design_patterns.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Items> itemsList;

    public Cart(){
        this.itemsList = new ArrayList<>();
    }

    public void addItem(Items item){
        this.itemsList.add(item);
    }

    public void removeItem(Items item){
        this.itemsList.remove(item);
    }

    private BigDecimal getTotalAmount(){
        return itemsList.stream().map(Items::getPrice).reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public void pay(PaymentStrategy paymentStrategy){
        BigDecimal totalAmount = getTotalAmount();
        paymentStrategy.pay(totalAmount);
    }

}
