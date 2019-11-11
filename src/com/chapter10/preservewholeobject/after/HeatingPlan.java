package com.chapter10.preservewholeobject.after;

//객체를 통째로 전달
public class HeatingPlan {
    private TempRange range = new TempRange();

    boolean withinRange(TempRange roomRange) {
        return range.includes(roomRange);
    }
}