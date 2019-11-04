package com.chapter06.removeassignmentstoparameters.before;

//매개변수로의 값 대입 제거
//자바에서 값을 통한 전달

/**
실행 결과
triple 메서드 안의 arg 값: 15
triple 메서드 실행 후 x 값 : 5
 **/
public class Example02 {
    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println("triple 메서드 실행 후 x 값 : " + x);
    }

    private static void triple(int arg) {
        arg = arg * 3;
        System.out.println("triple 메서드 안의 arg 값: " + arg);
    }
}