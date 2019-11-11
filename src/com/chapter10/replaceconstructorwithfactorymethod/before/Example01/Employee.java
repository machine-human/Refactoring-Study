package com.chapter10.replaceconstructorwithfactorymethod.before.Example01;

//생성자를 팩토리 메서드로 전환
public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int type;

    Employee(int type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Employee eng = new Employee(Employee.ENGINEER);
    }
}

