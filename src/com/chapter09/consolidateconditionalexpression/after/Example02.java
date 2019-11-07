package com.chapter09.consolidateconditionalexpression.after;

//중복 조건식 통합
//논리곱(AND) 연산자
public class Example02 {

    double disabilityAmount() {
        if (onVaction() && lengthOfService() > 10) {
            return 1;
        } else {
            return 0.5;
        }
    }
}