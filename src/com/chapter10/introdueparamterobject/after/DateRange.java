package com.chapter10.introdueparamterobject.after;

import java.util.Date;

public class DateRange {
    //모든 값을 final로 선언하고 생성자 안에 지정
    //그래서 값을 변경하는 메서드가 없음
    //이럴 경우 각종 별칭 버그가 방지되어 좋음
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    Date getStart() {
        return start;
    }

    Date getEnd() {
        return end;
    }

    //매개변수 나열 부분을 객체로 전환하는 작업 후
    //기능을 새 객체의 다른 메서드로 옮기는 작업을 추가로 실시한다면 더욱 효과적
    boolean includes(Date arg) {
        return (arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end)));
    }
}
