package com.chapter09.introducenullobject.after;

public class BillingPlan {
	static BillingPlan basic() {
		return new BillingPlan();
	}

	static BillingPlan special() {
		return new BillingPlan();
	}
}
