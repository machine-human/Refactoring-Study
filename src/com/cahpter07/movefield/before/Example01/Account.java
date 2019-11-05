package com.cahpter07.movefield.before.Example01;

//필드 이동 (필드 캡슐화)
public class Account {
    private AccountType type;
    private double interestRate;

    private double interestForAmount_days(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}