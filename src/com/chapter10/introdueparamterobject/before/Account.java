package com.chapter10.introdueparamterobject.before;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

//매개변수 세트를 객체로 전환
public class Account {
    private Vector entries = new Vector();

    double getFlowBetween(Date start, Date end) {
        double result = 0;
        Enumeration e = entries.elements();
        while (e.hasMoreElements()) {
            Entry each = (Entry) e.nextElement();
            if (each.getDate().equals(start) || each.getDate().equals(end) ||
                    (each.getDate().after(start) && each.getDate().before(end))) {
                result += each.getValue();
            }
        }
        return result;
    }
}
