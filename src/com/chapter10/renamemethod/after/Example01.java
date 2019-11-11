package com.chapter10.renamemethod.after;

//메서드명 변경
public class Example01 {

    @Deprecated
    public String getTelephoneNumber() {
        return getOfficeTelephoneNumber();
    }

    public String getOfficeTelephoneNumber() {
        int officeNumber = 100;
        String officeAreaCode = "seoul";
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
}
