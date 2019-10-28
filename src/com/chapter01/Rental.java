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

}
