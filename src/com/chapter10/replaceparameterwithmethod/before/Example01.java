package com.chapter10.replaceparameterwithmethod.before;

//매개변수 세트를 메서드로 전환
public class Example01 {
    private int quantity = 1;
    private int itemPrice = 1;

    public double getPrice() {
        int basePrice = quantity * itemPrice;
        int discountLevel;

        if (quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }

        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
