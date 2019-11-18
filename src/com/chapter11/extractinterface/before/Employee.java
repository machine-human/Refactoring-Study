package com.chapter11.extractinterface.before;

//인터페이스 추출
public class Employee {
    private int rate;

    public Employee(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public boolean hasSpecialSkill() {
        return true;
    }
}

