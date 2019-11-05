package com.cahpter07.movemethod.after;

//메서드 이동
public class AccountType {
    public boolean isPremium() {
        return false;
    }

    public double overdraftChange(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}