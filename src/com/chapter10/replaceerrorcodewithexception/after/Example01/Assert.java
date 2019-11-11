package com.chapter10.replaceerrorcodewithexception.after.Example01;

//에러 부호를 예외 통지로 교체
//미확인 예외
public class Assert {
    static void isTrue(String comment, boolean test) {
        if (!test) {
            throw new RuntimeException("어설션 실패: " + comment);
        }
    }
}
