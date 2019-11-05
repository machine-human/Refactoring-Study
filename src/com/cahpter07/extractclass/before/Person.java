package com.cahpter07.extractclass.before;

import com.cahpter07.extractclass.after.TelephoneNumber;

//클래스 추출
public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }

    String getOfficeAreaCode() {
        return officeAreaCode;
    }

    void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    String getOfficeNumber() {
        return officeNumber;
    }

    void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
