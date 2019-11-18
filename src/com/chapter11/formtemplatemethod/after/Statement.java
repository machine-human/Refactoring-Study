package com.chapter11.formtemplatemethod.after;

import java.util.Enumeration;

//템플릿 메서드 형성
public abstract class Statement {
	abstract String headerString(Customer aCustomer);

	abstract String eachRentalStirng(Rental aRental);

	abstract String footerString(Customer aCustomer);

	public String value(Customer customer) {
		Enumeration rentals = customer.getRentals();
		String result = headerString(customer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += eachRentalStirng(each);
		}
		// 푸터 행 추가
		result += footerString(customer);
		return result;
	}
}
