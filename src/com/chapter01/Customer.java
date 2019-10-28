package com.chapter01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 고객 클래스
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    /**
     * 지나치게 많은 기능이 들어 있어 문제 많은 메서드
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> enumerationRentals = rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while (enumerationRentals.hasMoreElements()) {
            //코드로 인해 변경 됨
            //변경되는 변수는 더 주의해야 함
            //변경되는 변수가 하나뿐이라면 그 변수를 반환할 수 있음
            double thisAmount = 0;
            //코드로 인해 변경되지 않음 (매개변수로 전달할 수 있음
            Rental each = enumerationRentals.nextElement();

            //비디오 종류별 대여료 계산
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            //적립 포인트 1포인트 증가
            frequentRenterPoints++;

            //최신물을 이틀 이상 대여하면 보너스 포인트 지급
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //이번에 대여하는 비디오 정보와 대여로를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";

            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }

        //푸터 행 추가
        result += "누적 대여료 : " + totalAmount + "\n";
        result += "적립 포인트 : " + frequentRenterPoints;
        return result;
    }
}
