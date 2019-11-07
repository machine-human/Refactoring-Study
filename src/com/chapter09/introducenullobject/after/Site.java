package com.chapter09.introducenullobject.after;

public class Site {
	Customer customer;

	Customer getCustomer() {
		return (customer == null) ? Customer.newNull() : customer;
	}
}

class Customer {

	// Null Customer가 사용
	protected Customer() {
	}

	private BillingPlan billingPlan;

	static Customer newNull() {
		return new NullCustomer();
	}

	public String getName() {
		return "test";
	}

	public BillingPlan getPlan() {
		return new BillingPlan();
	}

	public PaymentHistory getHistory() {
		return new PaymentHistory();
	}

	public void setPlan(BillingPlan arg) {
		billingPlan = arg;
	}

	public boolean isNull() {
		return false;
	}
}

class NullCustomer extends Customer {
	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "occupant";
	}

	@Override
	public void setPlan(BillingPlan arg) {

	}

	public PaymentHistory getHistory() {
		return PaymentHistory.newNull();
	}
}
