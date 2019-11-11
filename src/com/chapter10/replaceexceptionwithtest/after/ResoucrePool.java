package com.chapter10.replaceexceptionwithtest.after;

import java.util.Stack;

//예외 처리를 테스트로 교체
public class ResoucrePool {
    Stack available;
    Stack allocated;

    Resource getResource() {
        Resource result;
        if (available.isEmpty()) {
            result = new Resource();
            allocated.push(result);
            return result;
        } else {
            result = (Resource) available.pop();
            allocated.push(result);
            return result;

            //테스트 후 예외가 발생하지 않으면 try 절을 완전히 삭제
            /*
            try {
                result = (Resource) _available.pop();
                _allocated.push(result);
                return result;
            } catch (EmptyStackException e) {
                Assert.shouldNeverReachHere("pop 실행 시에 available이 비어 있음");
                result = new Resource();
                _allocated.push(result);
                return result;
            }*/
        }
    }
}

class Assert {
    static void shouldNeverReachHere(String message) {
        throw new RuntimeException(message);
    }
}