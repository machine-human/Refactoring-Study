package com.chapter01;

abstract class Price {
    abstract int getPriceCode();

    //비디오 종류별 대여료 계산 기능을 빼내어 별도의 함수로 작성
    abstract double getCharge(int daysRented);

    //최신물을 이틀 이상 대여하면 2포인트 지급하고 그 외엔 1포인트 지급하는 코드를
    //빼내 getFrequentRenterPoints 메서드로 만들고 이 Rental 클래스로 옮겼다.
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class ChildrensPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}

class NewReleasePrice extends Price {

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}

class RegularPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }

    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}