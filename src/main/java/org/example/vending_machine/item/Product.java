package org.example.vending_machine.item;

import java.util.UUID;

public class Product {
    private final String productId;
    private final String name;
    private final String desc;
    private final double price;
    private int stock;

    public Product(String name,String desc,double price,int stock) {
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.desc=desc;
        this.price=price;
        this.stock=stock;
    }

    public synchronized void increaseStock(int quantity) {
        stock += quantity;
    }

    public synchronized void decreaseStock(int quantity) {
        if (stock < quantity) throw new IllegalStateException("Insufficient stock");
        stock -= quantity;
    }

    public synchronized void updateQuantity(int quantity) {
        this.stock += quantity;
    }

    public synchronized boolean isAvailable(int quantity) {
        return this.stock >= quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
