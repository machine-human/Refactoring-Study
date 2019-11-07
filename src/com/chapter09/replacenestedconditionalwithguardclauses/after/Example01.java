package com.chapter09.replacenestedconditionalwithguardclauses.after;

//여러 겹의 조건문을 감시 절로 전환
public class Example01 {
    double getPayAmount() {
        double result;
        boolean isDead = false;
        boolean isSeparated = true;
        boolean isRetired = true;

        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmount();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
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
