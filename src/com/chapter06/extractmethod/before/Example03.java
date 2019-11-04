package com.chapter06.extractmethod.before;

import com.chapter06.extractmethod.Order;

import java.util.Enumeration;
import java.util.Vector;

//지역변수 지역변수를 다시 대입
public class Example03 {
    private Vector ordres = new Vector<Order>();
    private String name;

    public Example03() {
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

    void printDetails(double outstanding) {
        // 세부 내역 출력
        System.out.println("고객명: " + name);
        System.out.println("외상액: " + outstanding);
    }
}