package com.chapter10.introdueparamterobject.after;

import java.util.Enumeration;
import java.util.Vector;

//매개변수 세트를 객체로 전환
public class Account {
    private Vector entries = new Vector();

    double getFlowBetween(DateRange range) {
        double result = 0;
        Enumeration e = entries.elements();
        while (e.hasMoreElements()) {
            Entry each = (Entry) e.nextElement();
            if (range.includes(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }
}
