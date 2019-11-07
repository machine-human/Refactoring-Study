package com.chapter09.decomposeconditional.before;

import java.util.Date;

//조건문 쪼개기
public class Example01 {
    final static Date SUMMER_START = new Date("2019-06-01");
    final static Date SUMMER_END = new Date("2019-10-01");

    public static void main(String[] args) {
        Date date = new Date();
        double charge = 0;
        int quantity = 10;
        double winterRate = 0.8;
        double summerRate = 0.5;
        int winterServiceCharge = 100;

        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }
}