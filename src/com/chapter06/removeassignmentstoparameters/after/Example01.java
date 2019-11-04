package com.chapter06.removeassignmentstoparameters.after;

//매개변수로의 값 대입 제거
//1. 매개변수를 임시변수로 변환
//2. 이 관례를 강제 적용하고자 매개변수에 final 키워드 사용
//사실 짧은 메서드의 경우 final로 선언해도 더 알아보기 쉽지 않음,
//긴 메서드에는 다른 코드가 매개변수에 새 값을 대입하는지 쉽게 파악하기 위해 final 사용
public class Example01 {
    private int discount(final int inputVal,final int quantity,final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;
        return result;
    }
}