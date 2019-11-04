package com.chapter06.extractmethod.before;

import com.chapter06.extractmethod.Order;

import java.util.Enumeration;
import java.util.Vector;

//임시 변수에 더 복잡한 작업이 일어날 때
public class Example04 {
    private Vector ordres = new Vector<Order>();
    private String name;

    public Example04() {
        ordres.add(new Order("apple", 1000));
        ordres.add(new Order("banana", 2000));
    }

    public void printOwing(double previousAmount) {
        Enumeration e = ordres.elements();
        double outstanding = previousAmount * 1.2;
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

    private double getOutstanding() {
        Enumeration e = ordres.elements();
        double result = 0.0;
        // 외상액 계산
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }
}