package com.cahpter07.movefield.after.Example01;

//필드 이동 (필드 캡슐화)
public class Account {
    private AccountType type;

    private double interestForAmount_days(double amount, int days) {
        return type.getInterestRate() * amount * days / 365;
    }
}