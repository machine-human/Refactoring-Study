package com.chapter10.replaceconstructorwithfactorymethod.before.Example03;

//생성자를 팩토리 메서드로 전환
//메서드를 사용하는 하위클래스 작성
//상위클래스가 하위클래스 정보를 알고 있는 상태가 유지 됨
public class Execute {
    public static void main(String[] args) {
        Person kent = new Male();
    }
}
