package com.chapter10.preservewholeobject.before;

//객체를 통째로 전달
public class Room {
    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRnage().getLow();
        int high = daysTempRnage().getHigh();
        return plan.withinRange(low, high);
    }

    private TempRange daysTempRnage() {
        return new TempRange();
    }
}
