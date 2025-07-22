package org.example.vending_machine;

import org.example.vending_machine.item.Product;

import org.example.vending_machine.payment.PaymentContext;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList;
    private final PaymentContext paymentContext;

    public Cart(PaymentContext paymentContext,List<Product> productList) {
        this.paymentContext = paymentContext;
        this.productList = productList;
    }

    public void addToCart(String productId){

    }
}
