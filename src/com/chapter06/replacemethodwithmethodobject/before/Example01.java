package com.chapter06.replacemethodwithmethodobject.before;

//메서드를 메서드 객체로 전환
public class Example01 {
}

class Account {
    public int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        // 기타 작업
        return importantValue3 - 2 * importantValue1;
    }

    private int delta() {
        return 1;
    }
}