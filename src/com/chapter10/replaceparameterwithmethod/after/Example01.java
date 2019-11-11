package com.chapter10.replaceparameterwithmethod.after;

//매개변수 세트를 메서드로 전환
public class Example01 {
    private int quantity = 1;
    private int itemPrice = 1;

    public double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private double getBasePrice() {
        return quantity * itemPrice;
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }
}
