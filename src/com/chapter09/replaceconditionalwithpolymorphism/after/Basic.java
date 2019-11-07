package com.chapter09.replaceconditionalwithpolymorphism.after;

import org.junit.Assert;

//어설션 넣기
public class Basic {
    double getExpenseLimit() {
        Memeber primaryProject = new Memeber();
        final double NULL_EXPENSE = 0;
        double expenseLimit = 10;

        Assert.assertTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);
        return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
    }
}

class Memeber {
    public double getMemberExpenseLimit() {
        return 1.0;
    }
}