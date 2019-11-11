package com.chapter10.replaceconstructorwithfactorymethod.after.Example03;

//생성자를 팩토리 메서드로 전환
//메서드를 사용하는 하위클래스 작성
public class Person {
    static Person createMale() {
        return new Male();
    }

    static Person createFemale() {
        return new Female();
    }
}

class Male extends Person {

}

class Female extends Person {

}
