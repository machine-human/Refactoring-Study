package com.chapter09.removecontrolflag.before;

//제어 플래그 제거
//간단한 제어 플래그를 break 문으로 교체
public class Example01 {
    void checkSecurity(String[] people) {
        boolean found = false;

        for (int i = 0; i < people.length; i++) {
            if (!found) {
                if (people[i].equals("Done")) {
                    sendAlert();
                    found = true;
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {
        System.out.println("검색 완료");
    }
}