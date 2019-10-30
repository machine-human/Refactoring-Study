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
    public double getCharge() {
        return movie.getCharge(dayRented);
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(dayRented);
    }
}
