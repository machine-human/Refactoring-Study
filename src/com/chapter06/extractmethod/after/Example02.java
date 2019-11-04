package com.chapter06.extractmethod.after;

import com.chapter06.extractmethod.Order;

import java.util.Enumeration;
import java.util.Vector;

//지역변수 사용
public class Example02 {
    private Vector ordres = new Vector<Order>();
    private String name;

    public Example02() {
        ordres.add(new Order("apple", 1000));
        ordres.add(new Order("banana", 2000));
    }

    public void printOwing() {
        Enumeration e = ordres.elements();
        double outstanding = 0.0;

        printBanner();

        // 외상액 계산
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        printDetails(outstanding);
    }

    private void printBanner() {
        // 배너 출력
        System.out.println("**************************");
        System.out.println("******** 고객 외상 ********");
        System.out.println("**************************");
    }

    private void printDetails(double outstanding) {
        // 세부 내역 출력
        System.out.println("고객명: " + name);
        System.out.println("외상액: " + outstanding);
    }
}