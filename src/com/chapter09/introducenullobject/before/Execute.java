package com.chapter09.introducenullobject.before;

//Null 검사를 널 객체에 위임
public class Execute {

	public void execute() {
		Site site = new Site();
		Customer customer = site.getCustomer();
		BillingPlan plan;

		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}

		String customerName;
		if (customer == null) {
			customerName = "occupant";
		} else {
			customerName = customer.getName();
		}

		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		}
	}
}
