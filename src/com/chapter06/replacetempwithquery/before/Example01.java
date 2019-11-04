package com.chapter06.replacetempwithquery.before;

public class Example01 {
    private double quantitiy = 5;
    private double itemPrice = 1000;

    private double getPrice() {
        double basePrice = quantitiy * itemPrice;
        double discountFactor = 0;

        if (basePrice > 1000) basePrice = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
}
