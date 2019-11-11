package com.chapter10.introdueparamterobject.before;

import java.util.Date;

//매개변수 세트를 객체로 전환
public class Entry {
    private Date chargeDate;
    private double value;

    public Entry(double value, Date chargeDate) {
        value = value;
        chargeDate = chargeDate;
    }

    Date getDate() {
        return chargeDate;
    }

    double getValue() {
        return value;
    }
}
