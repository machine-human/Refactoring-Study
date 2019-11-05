package com.cahpter07.inlineclass.after;

//클래스 내용 직접 삽입
public class Person {
    private String name;
    private String areaCode;
    private String number;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }
}
