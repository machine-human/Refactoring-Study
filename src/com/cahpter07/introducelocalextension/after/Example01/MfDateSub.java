package com.cahpter07.introducelocalextension.after.Example01;

import java.util.Date;

//국소적 상속확장 클래스 사용
public class MfDateSub extends Date {
    public MfDateSub(String dateString) {
        super(dateString);
    }

    public MfDateSub(Date arg) {
        super(arg.getTime());
    }
}