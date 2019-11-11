package com.chapter10.replaceexceptionwithtest.before;

import java.util.EmptyStackException;
import java.util.Stack;

//예외 처리를 테스트로 교체
public class ResoucrePool {
    Stack available;
    Stack allocated;

    Resource getResource() {
        Resource result;
        try {
            result = (Resource) available.pop();
            allocated.push(result);
            return result;
        } catch (EmptyStackException e) {
            result = new Resource();
            allocated.push(result);
            return result;
        }
    }
}
