package com.chapter09.introduceassertion.before;

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
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("없는 사원입니다.");
        }
    }

    private int getTypeCode() {
        return type.getTypeCode();
    }
}

