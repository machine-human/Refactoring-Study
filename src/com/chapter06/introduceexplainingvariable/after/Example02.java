package com.chapter06.introduceexplainingvariable.after;

//메서드 추출
//1. basePrice(수량*단가) 메소드 생성 (quantitiy * itemPice 계산)
//2. quantityDiscount(대량 구매 할인액) 메소드 생성 (Math.max(0, quantitiy - 500) * itemPrice * 0.05 계산)
//3. shipping(배송료) 메소드 생성 (Math.min(basePrice * 0.1, 100.0 계산)
public class Example02 {
    private double quantitiy;
    private double itemPrice;

    private double price() {
        // 결제액(price) = 총 구매액(base price) -
        // 대량 구매 할인(quantitiy discount) + 배송비(shipping)
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice() {
        return quantitiy * itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, quantitiy - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(quantitiy * itemPrice * 0.1, 100.0);
    }
}
