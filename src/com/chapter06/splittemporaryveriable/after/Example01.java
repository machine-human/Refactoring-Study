package com.chapter06.splittemporaryveriable.after;

//임시변수 분리
//acc 변수 분리
//1. acc -> primaryAcc 받은 힘으로 생긴 초기 가속도를 저장하는 임시변수
//2. acc -> secondaryAcc 힘으로 생긴 가속을 더한 값을 저장하는 임시변수
//아래 코드는 아직 추가적인 리팩토링 적용할 여지가 있음 스스로 해볼것 (예 - 메소드 추출 기법)
public class Example01 {
    private double primartForce;
    private double mass;
    private int delay;
    private double secondaryForce;

    private double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = primartForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;

        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            final double secondaryAcc = (primartForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 *
                    secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }
}