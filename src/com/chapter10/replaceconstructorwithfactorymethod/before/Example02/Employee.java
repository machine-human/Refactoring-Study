package com.chapter10.replaceconstructorwithfactorymethod.before.Example02;

//생성자를 팩토리 메서드로 전환
//문자열을 사용하는 하위클래스 작성
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    public static void main(String[] args) {
        Employee eng = Employee.create(Employee.ENGINEER);
    }
}

class Engineer extends Employee {

}

class Salesman extends Employee {

}

class Manager extends Employee {

}
