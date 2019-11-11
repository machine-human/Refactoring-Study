package com.chapter10.replaceconstructorwithfactorymethod.after.Example02;

//생성자를 팩토리 메서드로 전환
//문자열을 사용하는 하위클래스 작성
//단점은 switch문이 생긴다는 것
public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
    private int type;

    @Deprecated
    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return create("Engineer");
            case SALESMAN:
                return create("Salesman");
            case MANAGER:
                return create("Manager");
            default:
                throw new IllegalArgumentException("없는 분류 부호 값");
        }
    }

    static Employee create(String name) {
        try {
            //새 하위클래스를 추가해야 할 땐 생성 된 switch 문을 반드시 수정해야 함
            //하지만 이 작업은 잊기 쉬움
            //잊는 것을 방지하려면 Class.forName을 사용하는 것이 좋다.
            return (Employee) Class.forName(name).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("객체 " + name + "를 인스턴스화할 수 없음");
        }
    }

    public static void main(String[] args) {
        //정수 타입을 매개변수로 받는 create 메서드를 string을 매개변수로 받는 새 메서드 호출로 변경
        //Employee eng = Employee.create(Employee.ENGINEER);
        Employee eng = Employee.create("Enginner");
    }
}

class Engineer extends Employee {

}

class Salesman extends Employee {

}

class Manager extends Employee {

}
