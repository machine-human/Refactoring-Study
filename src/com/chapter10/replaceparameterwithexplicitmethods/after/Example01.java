package com.chapter10.replaceparameterwithexplicitmethods.after;

//매개변수를 메서드로 전환
public class Example01 {

    static Example01 createEngineer() {
        return new Engineer();
    }

    static Example01 createSalesman() {
        return new Salesman();
    }

    static Example01 createManager() {
        return new Manager();
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
        Example01 kent = Example01.createEngineer();
    }
}
