package com.chapter10.parameterizemethod.after;

//메서드를 매개변수로 전환
public class Example02 {
    private double salary = 0.0;

    protected Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;
        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return new Dollars(result);
    }

    protected int usageInRange(int start, int end) {
        if (lastUsage() > start) {
            return Math.min(lastUsage(), end) - start;
        } else {
            return 0;
        }
    }
}
