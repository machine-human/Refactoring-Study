package com.chapter11.extractsuperclass.after;

abstract class Party {
    private String name;

    protected Party(String name) {
        this.name = name;
    }

    //Employee 클래스와 Department 클래스에 모두 존재하는
    //getName 메서드에 메서드 상향 적용
    public String getName() {
        return name;
    }

    abstract public int getAnnualCost();
}
