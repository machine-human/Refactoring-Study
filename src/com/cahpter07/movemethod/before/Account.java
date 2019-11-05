package com.cahpter07.movemethod.before;

//메서드 이동
public class Account {
    private AccountType type;
    private int daysOverdrawn;

    private double overdraftChange() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }

    private double bankCharge() {
        double result = 4.5;
        if (daysOverdrawn > 0) {
            result += overdraftChange();
        }
        return result;
    }
}