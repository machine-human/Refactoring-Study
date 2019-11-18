package com.chapter11.extractinterface.before;

//인터페이스 추출
public class TimeSheet {
    double charge(Employee emp, int days) {
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }
}