package com.chapter09.consolidateconditionalexpression.after;

//중복 조건식 통합
//논리합(OR) 연산자
public class Example01 {
    int seniority = 1;
    int monthsDisabled = 13;
    boolean isPartTime = true;

    double disabilityAmount() {
        if (isNotElgibleForDisability()) {
            return 0;
        }
        return -1;
    }

    boolean isNotElgibleForDisability() {
        return (seniority < 2) || (monthsDisabled > 12) || (isPartTime);
    }
}