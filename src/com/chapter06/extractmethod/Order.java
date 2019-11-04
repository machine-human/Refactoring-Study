package com.chapter06.extractmethod;

public class Order {
    private String name;
    private double amount;

    public Order(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
