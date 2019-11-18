package com.chapter11.extractsuperclass.after;

//상위 클래스로 추출
public class Employee extends Party {
    private String name;
    private int annualCost;
    private String id;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
