package com.chapter10.preservewholeobject.after;

//객체를 통째로 전달
public class Room {
    boolean withinPlan(HeatingPlan plan) {
        return plan.withinRange(daysTempRnage());
    }

    private TempRange daysTempRnage() {
        return new TempRange();
    }
}
