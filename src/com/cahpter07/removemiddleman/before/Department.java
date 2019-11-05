package com.cahpter07.removemiddleman.before;

//과잉 중개 메서드 제거
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