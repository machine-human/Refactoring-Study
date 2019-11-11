package com.chapter10.replaceconstructorwithfactorymethod.after.Example01;

//생성자를 팩토리 메서드로 전환
public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int type;

    private Employee(int type) {
        this.type = type;
    }

    static Employee create(int type) {
        return new Employee(type);
    }

    public static void main(String[] args) {
        Employee eng = new Employee(Employee.ENGINEER);
    }
}

