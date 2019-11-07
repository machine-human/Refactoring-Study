package com.chapter09.removecontrolflag.after;

//제어 플래그 제거
//간단한 제어 플래그를 break 문으로 교체
public class Example01 {
    void checkSecurity(String[] people) {
        boolean found = false;

        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Done")) {
                sendAlert();
                break;
            }
            if (people[i].equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
        System.out.println("검색 완료");
    }
}