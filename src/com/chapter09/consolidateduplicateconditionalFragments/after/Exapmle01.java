package com.chapter09.consolidateduplicateconditionalFragments.after;

//조건문의 공통 실행 코드 빼내기
public class Exapmle01 {
    public static void main(String[] args) {
        double total = 0.0;
        int price = 1000;

        if (isSpecialDeal()) {
            total = price * 0.95;
        } else {
            total = price * 0.98;
        }
        send();
    }

    private static void send() {
        System.out.println("send");
    }

    private static boolean isSpecialDeal() {
        return true;
    }
}