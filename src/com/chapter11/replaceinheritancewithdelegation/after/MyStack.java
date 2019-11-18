package com.chapter11.replaceinheritancewithdelegation.after;

import java.util.Vector;

//상속을 위임으로 전환
public class MyStack {
    private Vector vector = new Vector();

    public void push(Object element) {
        vector.insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = vector.firstElement();
        vector.removeElementAt(0);
        return result;
    }

    public int size() {
        return vector.size();
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }
}
