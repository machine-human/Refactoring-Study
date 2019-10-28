package com.chapter01;

/**
 * 대여 정보 클래스
 */
public class Rental {

    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return dayRented;
    }

    //비디오 종류별 대여료 계산 기능을 빼내어 별도의 함수로 작성
    //기존 Customer 클래스의 amountFor(Rental aRental) 메소드
    /**변경 사항**/
    //접근 제한자 변경 (private -> public)
    //메소드 명 (amoutFor -> getCharge)
    //매개 변수 삭제 (amoutFor(Rental aRental) -> getCharge())
    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;
    }

}
