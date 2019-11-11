package com.chapter10.parameterizemethod.after;

//메서드를 매개변수로 전환
public class Example01 {
    private double salary = 0.0;

    void raise(double factor) {
        salary *= (1 + factor);
    }
}
