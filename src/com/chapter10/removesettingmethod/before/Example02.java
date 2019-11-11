package com.chapter10.removesettingmethod.before;

//쓰기 메서드 제거
public class Example02 extends Example01 {
    private double interestRate;

    Example02(String id, double rate) {
        setId(id);
        this.interestRate = rate;
    }
}
