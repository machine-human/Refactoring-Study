package com.cahpter07.movefield.after.Example02;

//필드 이동 (필드 자체 캡슐화)
public class Account {
    private AccountType type;

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double arg) {
        type.setInterestRate(arg);
    }

    private double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }
}