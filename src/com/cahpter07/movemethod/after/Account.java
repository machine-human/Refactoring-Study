package com.cahpter07.movemethod.after;

//메서드 이동
public class Account {
    private AccountType type;
    private int daysOverdrawn;

    private double overdraftChange() {
        return type.overdraftChange(daysOverdrawn);
    }

    private double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftChange();
        }
        return result;
    }
}