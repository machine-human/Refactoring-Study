package com.chapter09.consolidateconditionalexpression.before;

//중복 조건식 통합
//단순히 조건문을 검사해서 값을 반환할 땐 삼항 연산자를 사용
public class Example03 {

    double disabilityAmount() {
        if (onVaction() && lengthOfService() > 10) {
            return 1;
        } else {
            return 0.5;
        }
    }
}