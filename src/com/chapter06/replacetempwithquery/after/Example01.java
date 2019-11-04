package com.chapter06.replacetempwithquery.after;

//임시변수를 final로 선언 (임시변수들이 한 번만 대입을 받는지 시험)
//임시변수를 한 번에 하나씩 메서드 호출로 변경
//1. basePrice -> basePrice()
//2. discountFactor -> discountFactor()
//위 처럼 basePrice 임시변수를 메서드 호출로 바꾸지 않았다면 discountFactor 메서드로 빼내기가 매우 힘들었을 것
public class Example01 {
    private double quantitiy = 5;
    private double itemPrice = 1000;

    private double getPrice() {
        return basePrice() * discountFactor();
    }

    private double basePrice() {
        return quantitiy * itemPrice;
    }

    private double discountFactor() {
        if (basePrice() > 1000) return 0.95;
        else return 0.98;
    }

}
