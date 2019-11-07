package com.chapter09.replaceconditionalwithpolymorphism.before;

//어설션 넣기
public class Basic {
	double getExpenseLimit() {
		Memeber primaryProject = new Memeber();
		final double NULL_EXPENSE = 0;
		double expenseLimit = 10;

		return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
	}
}

class Memeber {
	public double getMemberExpenseLimit() {
		return 1.0;
	}
}
