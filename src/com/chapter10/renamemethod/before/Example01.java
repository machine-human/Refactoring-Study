package com.chapter10.renamemethod.before;

//메서드명 변경
public class Example01 {
    public String getTelephoneNumber() {
        int officeNumber = 100;
        String officeAreaCode = "seoul";
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
}
