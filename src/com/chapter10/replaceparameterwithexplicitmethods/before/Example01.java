package com.chapter10.replaceparameterwithexplicitmethods.before;

//매개변수를 메서드로 전환
public class Example01 {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Example01 create(int type) {
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
}


class Engineer extends Example01 {

}

class Salesman extends Example01 {

}

class Manager extends Example01 {

}

class Main {
    public static void main(String[] args) {
        Example01 kent = Example01.create(Example01.ENGINEER);
    }
}
