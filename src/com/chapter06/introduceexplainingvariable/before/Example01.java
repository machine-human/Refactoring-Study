package com.chapter06.introduceexplainingvariable.before;

//직관적 임시변수 사용
public class Example01 {
    private double quantitiy;
    private double itemPrice;

    private double price() {
        // 결제액(price) = 총 구매액(base price) -
        // 대량 구매 할인(quantitiy discount) + 배송비(shipping)
        return quantitiy * itemPrice -
                Math.max(0, quantitiy - 500) * itemPrice * 0.05 +
                Math.min(quantitiy * itemPrice * 0.1, 100.0);
    }
}
