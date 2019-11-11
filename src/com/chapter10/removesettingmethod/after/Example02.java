package com.chapter10.removesettingmethod.after;

//쓰기 메서드 제거
//아래 문제는 id 변수에 직접 접근해서 값을 설정할 수 없음
public class Example02 extends Example01 {
    private double interestRate;

    Example02(String id, double rate) {
        //최선의 방법은 상위클래스 생성자를 이용
        //setId(id);
        super(id);
        this.interestRate = rate;
    }
}
