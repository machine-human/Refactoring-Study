package com.cahpter07.hidedelegate.before;

//대리 객체 은폐
public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }

    public String getChageCode() {
        return chargeCode;
    }

    public void setChageCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }
}
