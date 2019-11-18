package com.chapter11.pullupmethod.after;

import java.util.Date;

//메서드 상향
public abstract class Customer {
    abstract double chargeFor(Date date);

    void createBill(Date date) {
        double chargeAmount = chargeFor(date);
    }
}

class Regular extends Customer {
    @Override
    double chargeFor(Date date) {
        Date now = new Date();
        if (date.after(now)) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Preferred extends Customer {
    @Override
    double chargeFor(Date date) {
        Date now = new Date();
        if (date.after(now)) {
            return 2;
        } else {
            return 0;
        }
    }
}