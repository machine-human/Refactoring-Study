package com.cahpter07.introduceforeignmethod.after;

import java.util.Date;

//외래 클래스에 메서드 추가
public class Exapmle01 {
    private static Date nextDay(Date arg) {
        //Date 클래스에 있을 외래 메서드
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    private void execute() {
        Date prviousEnd = new Date();
        Date newStart = nextDay(prviousEnd);
    }
}
