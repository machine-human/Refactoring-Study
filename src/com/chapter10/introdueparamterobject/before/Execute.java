package com.chapter10.introdueparamterobject.before;

import java.util.Date;

//매개변수 세트를 객체로 전환
public class Execute {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();

        Account anAccount = new Account();
        double flow = anAccount.getFlowBetween(startDate, endDate);
    }
}
