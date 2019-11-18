package com.chapter11.formtemplatemethod.after;

//템플릿 메서드 형성
public class HtmlStatement extends Statement {
	@Override
    String headerString(Customer aCustomer) {
		return "<H1><EM>" + aCustomer.getName() + " 고객님의 대여 기록</EM></H1><P>\n";
	}

	@Override
    String eachRentalStirng(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" +
				String.valueOf(aRental.getCharge()) + "\n";
	}

	@Override
    String footerString(Customer aCustomer) {
		return "<P>누적 대여료 : <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
				"적립 포인트 : <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM><P>";
	}
}
