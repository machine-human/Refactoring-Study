package com.chapter09.replacenestedconditionalwithguardclauses.before;

//여러 겹의 조건문을 감시 절로 전환
public class Example01 {
    double getPayAmount() {
        double result;
        boolean isDead = false;
        boolean isSeparated = true;
        boolean isRetired = true;

        if (isDead) {
            result = deadAmount();
        } else {
            if (isSeparated) {
                result = separatedAmount();
            } else {
                if (isRetired) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    private double separatedAmount() {
        return 0;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
