package com.chapter09.consolidateconditionalexpression.before;

//중복 조건식 통합
//논리합(OR) 연산자
public class Example01 {
    int seniority = 1;
    int monthsDisabled = 13;
    boolean isPartTime = true;

    double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        return -1;
    }
}