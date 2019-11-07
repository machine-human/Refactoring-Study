package com.chapter09.introducenullobject.before;

//Null 검사를 널 객체에 위임
public class Site {
	Customer customer;

	Customer getCustomer() {
		return customer;
	}
}

class Customer {
	public String getName() {
		return "test";
	}

	public BillingPlan getPlan() {
		return new BillingPlan();
	}

	public PaymentHistory getHistory() {
		return new PaymentHistory();
	}
}
