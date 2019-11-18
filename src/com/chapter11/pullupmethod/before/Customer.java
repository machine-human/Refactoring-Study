package com.chapter11.pullupmethod.before;

import java.util.Date;

//메서드 상향
public class Customer {

}

class Regular extends Customer {
    //createBill 메서드는 상위클래스로 올려보낼 수 없음
    //chargeFor 메서드가 하위클래스 마다 다르기 때문
    void createBill(Date date) {
        double chargeAmount = chargeFor(date);
    }

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
    //createBill 메서드는 상위클래스로 올려보낼 수 없음
    //chargeFor 메서드가 하위클래스 마다 다르기 때문
    void createBill(Date date) {
        double chargeAmount = chargeFor(date);
    }

    double chargeFor(Date date) {
        Date now = new Date();
        if (date.after(now)) {
            return 2;
        } else {
            return 0;
        }
    }
}