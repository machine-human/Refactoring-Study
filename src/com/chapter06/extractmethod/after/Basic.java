package com.chapter06.extractmethod.after;

// 메서드 추출 (변경 후)
public class Basic {
    String name;

    void printOwing(double amount) {
        printBanner();
        printDetails(amount);
    }

    void printDetails(double amount) {
        printBanner();
        //세부 정보 출력
        System.out.println("name:" + name);
        System.out.println("amount:" + amount);
    }

    private void printBanner() {
        // 배너 출력
        System.out.println("**************************");
        System.out.println("******** 고객 외상 ********");
        System.out.println("**************************");
    }

}
