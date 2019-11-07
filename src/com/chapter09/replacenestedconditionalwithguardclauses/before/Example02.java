package com.chapter09.replacenestedconditionalwithguardclauses.before;

//여러 겹의 조건문을 감시 절로 전환
//조건문을 역숙으로 만들기
public class Example02 {
    public double getAdjustedCapital() {
        double result = 0.0;
        double capital = 1.0;
        double intRate = 1.0;
        double duration = 1.0;
        int income = 10;
        final int ADJ_FACTOR = 2;

        if (capital > 0.0) {
            if (intRate > 0.0 && duration > 0.0) {
                result = (income / duration) * ADJ_FACTOR;
            }
        }
        return result;
    }
}