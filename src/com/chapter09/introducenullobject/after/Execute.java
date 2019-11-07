package com.chapter09.introducenullobject.after;

public class Execute {

	public static void main(String[] args) {
		Execute ex = new Execute();
		ex.execute();
	}

	public void execute() {
		Site site = new Site();
		Customer customer = site.getCustomer();
		BillingPlan plan;

		if (customer.isNull()) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}

		if (!customer.isNull()) {
			customer.setPlan(BillingPlan.special());
		}

		String customerName = customer.getName();

		int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
	}
}
