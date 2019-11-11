package com.chapter10.removesettingmethod.before;

//쓰기 메서드 제거
public class Example01 {
    private String id;

    Example01(String id) {
        setId(id);
    }

    void setId(String arg) {
        id = arg;
    }
}
