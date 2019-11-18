package com.chapter11.extractinterface.after;

//인터페이스 추출
public class Employee implements Billable {
    private int rate;

    public Employee(int rate) {
        this.rate = rate;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public boolean hasSpecialSkill() {
        return true;
    }
}

