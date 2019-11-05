package com.cahpter07.inlineclass.before;

//클래스 내용 직접 삽입
public class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getTelephoneNumber() {
        return ("(" + areaCode + ") " + number);
    }

    String getAreaCode() {
        return areaCode;
    }

    void setAreaCode(String arg) {
        areaCode = arg;
    }

    String getNumber() {
        return number;
    }

    void setNumber(String arg) {
        number = arg;
    }
}

