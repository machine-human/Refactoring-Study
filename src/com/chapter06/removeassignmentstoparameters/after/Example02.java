package com.chapter06.removeassignmentstoparameters.after;

import java.util.Date;

//매개변수로의 값 대입 제거
//자바에서 객체를 통한 전달
//기본적으로 객체 참조가 값을 통해 전달되었다.
//이 방식은 객체 속성은 변경할 수 있지만 매개 변수로의 새 값 대입은 고려하지 않는다.

/**
 실행결과
 nextDay 메서드 안의 arg 값 : Sat Apr 04 00:00:00 KST 1998
 nextDay 메서드 실행 후 d1 값 : Sat Apr 04 00:00:00 KST 1998
 nextDay 메서드 안의 arg 값 : Thu Apr 02 00:00:00 KST 1998
 nextDay 메서드 실행 후 d2 값 : Wed Apr 01 00:00:00 KST 1998
 */
public class Example02 {
    public static void main(String[] args) {
        Date d1 = new Date("1 Apr 98");
        nextDateUpdate(d1);
        System.out.println("nextDay 메서드 실행 후 d1 값 : " + d1);

        Date d2 = new Date("1 Apr 98");
        nextDateReplace(d2);
        System.out.println("nextDay 메서드 실행 후 d2 값 : " + d2);
    }

    private static void nextDateUpdate(Date arg) {
        arg.setDate(arg.getDay() + 1);
        System.out.println("nextDay 메서드 안의 arg 값 : " + arg);
    }

    private static void nextDateReplace(Date arg) {
        arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        System.out.println("nextDay 메서드 안의 arg 값 : " + arg);
    }
}
