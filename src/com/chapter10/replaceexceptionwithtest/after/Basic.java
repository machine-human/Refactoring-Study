package com.chapter10.replaceexceptionwithtest.after;

//예외 처리를 테스트로 교체
public class Basic {
    Integer[] values = new Integer[10];

    double getValueForPeriod(int peroidNumber) {
        if (peroidNumber >= values.length) {
            return 0;
        } else {
            return values[peroidNumber];
        }
    }
}
