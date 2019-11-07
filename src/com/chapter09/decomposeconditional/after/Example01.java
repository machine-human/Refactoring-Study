package com.chapter09.decomposeconditional.after;

import java.util.Date;

//조건문 쪼개기
public class Example01 {
    final static Date SUMMER_START = new Date("2019-06-01");
    final static Date SUMMER_END = new Date("2019-10-01");
    static double winterRate = 0.8;
    static double summerRate = 0.5;
    static double winterServiceCharge = 100;
    static double charge = 0;
    static int quantity = 10;

    public static void main(String[] args) {
        Date date = new Date();

        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }

    private double summerCharge(int quantity) {
        return quantity * summerRate;

    }

    private double winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }
}