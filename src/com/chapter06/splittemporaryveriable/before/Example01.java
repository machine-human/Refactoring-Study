package com.chapter06.splittemporaryveriable.before;

//임시변수 분리
public class Example01 {
    private double primartForce;
    private double mass;
    private int delay;
    private double secondaryForce;

    private double getDistanceTravelled(int time) {
        double result;
        double acc = primartForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - delay;

        if (secondaryTime > 0) {
            double primaryVel = acc * delay;
            acc = (primartForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 *
                    acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}