package com.chapter11.replaceinheritancewithdelegation.before;

import java.util.Vector;

//상속을 위임으로 전환
public class MyStack extends Vector {
    public void push(Object element) {
        insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
