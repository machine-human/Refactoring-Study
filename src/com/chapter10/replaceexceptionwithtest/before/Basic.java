package com.chapter10.replaceexceptionwithtest.before;

//예외 처리를 테스트로 교체
public class Basic {
    Integer[] values = new Integer[10];

    double getValueForPeriod(int peroidNumber) {
        try {
            return values[peroidNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
