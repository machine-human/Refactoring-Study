package com.chapter11.formtemplatemethod.after;

import java.util.Enumeration;
import java.util.Vector;

//템플릿 메서드 형성
public class Customer {
	private String name;
	private Vector rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		this.rentals.addElement(arg);
	}

	public Enumeration getRentals() {
		return rentals.elements();
	}

	public String getName() {
		return name;
	}

	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

	public String statement() {
		return new TextStatement().value(this);
	}

	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}

	public double getTotalCharge() {
		double result = 0;
		Enumeration rentals = rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	public int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
