package com.chapter09.introduceassertion.after;

// 조건문을 재정의로 전환
public class Employee {
    int monthlySalary = 0;
    int commission = 0;
    int bonus = 100;
    private EmployeeType type;

    Employee(EmployeeType type) {
        this.type = type;
    }

    int payAmount() {
        return type.payAmount(this);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }

    private int getTypeCode() {
        return type.getTypeCode();
    }
}

