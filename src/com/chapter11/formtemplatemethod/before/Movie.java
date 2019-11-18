package com.chapter11.formtemplatemethod.before;

//템플릿 메서드 형성
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;

    public String getTitle() {
        return title;
    }

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
        //_priceCode = priceCode;
    }

    private Price price;

    /**
     * 상태 패턴
     */
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
        }
    }

    public double getCharge(int dayRented) {
        return price.getCharge(dayRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
