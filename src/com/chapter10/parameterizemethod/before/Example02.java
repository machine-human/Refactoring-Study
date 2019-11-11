package com.chapter10.parameterizemethod.before;

//메서드를 매개변수로 전환
public class Example02 {
    private double salary = 0.0;

    protected Dollars baseCharge(){
        double result = Math.min(lastUsage(), 100) * 0.03;
        if (lastUsage() > 100){
            result += (Mathi.min(lastUsage(), 200) - 100) * 0.05;
        };

        if (lastUsage() > 200){
            result += (lastUsage() - 200) * 0.07;
        };

        return new Dollars (result);
    }
}
