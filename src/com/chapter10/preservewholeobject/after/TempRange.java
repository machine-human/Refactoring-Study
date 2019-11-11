package com.chapter10.preservewholeobject.after;

//객체를 통째로 전달
public class TempRange {
    public int getLow() {
        return 1;
    }

    public int getHigh() {
        return 1;
    }

    boolean includes(TempRange arg) {
        return arg.getLow() >= this.getLow() && arg.getHigh() <= this.getHigh();
    }
}
