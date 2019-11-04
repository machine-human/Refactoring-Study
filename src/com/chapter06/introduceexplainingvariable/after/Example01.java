package com.chapter06.introduceexplainingvariable.after;

//직관적 임시변수 사용
//1. basePrice(수량*단가) 임시변수 생성 (quantitiy * itemPice 계산)
//2. quantityDiscount(대량 구매 할인액) 임시변수 생성 (Math.max(0, quantitiy - 500) * itemPrice * 0.05 계산)
//3. shipping(배송료) 임시변수 생성 (Math.min(basePrice * 0.1, 100.0 계산)
public class Example01 {
    private double quantitiy;
    private double itemPrice;

    private double price() {
        // 결제액(price) = 총 구매액(base price) -
        // 대량 구매 할인(quantitiy discount) + 배송비(shipping)
        final double basePrice = quantitiy * itemPrice;
        final double quantityDiscount = Math.max(0, quantitiy - 500) * itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100.0);
        return basePrice - quantityDiscount + shipping;
    }
}
