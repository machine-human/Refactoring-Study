package com.chapter06.replacemethodwithmethodobject.after;

//메서드를 메서드 객체로 전환
//1. gamma 메서드를 메서드 객체로 전환하고자 Gamma 클래스 생성
//2. Gamma 클래스 안에 원본 객체를 나타내는 final 필드를 작성하고 원본 메서드 안의 각 매개변수와 임시변수를 나타내는 필드 작성
//3. 생성자 추가
//4. 원본 메서드 이동
//5. 원본 메서드가 생성한 메서드 객체로 위임하게 수정 -> return new Gamma(this, inputVal, quantity, yearToDate).compute();
//6. 이것으로 얻는 이득은 인자를 전달할 걱정 없이 compute 메서드에서 손쉽게 메서드 추출 기법을 실시 할 수 있음 -> importantThing() 메서드 추출
public class Example01 {
}

class Account {
    public int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 1;
    }
}

class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int impoartantValue1;
    private int impoartantValue2;
    private int impoartantValue3;

    public Gamma(Account source, int inputValArg, int quantitiyArg, int yearToDateArg) {
        this.account = source;
        this.inputVal = inputValArg;
        this.quantity = quantitiyArg;
        this.yearToDate = yearToDateArg;
    }

    public int compute() {
        impoartantValue1 = (inputVal * quantity) + account.delta();
        impoartantValue2 = (inputVal * yearToDate) + 100;
        importantThing();
        impoartantValue3 = impoartantValue2 * 7;
        // 기타 작업
        return impoartantValue3 - 2 * impoartantValue1;
    }

    private void importantThing() {
        if ((yearToDate - impoartantValue1) > 100) {
            impoartantValue2 -= 20;
        }
    }
}
