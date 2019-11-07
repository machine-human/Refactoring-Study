package com.chapter09.introducenullobject.before;

//Null 검사를 널 객체에 위임
public class BillingPlan {
	static BillingPlan basic() {
		return new BillingPlan();
	}
}
