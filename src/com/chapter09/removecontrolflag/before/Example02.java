package com.chapter09.removecontrolflag.before;

//제어 플래그 제거
//간단한 제어 플래그를 return 문으로 교체
public class Example02 {
    void checkSecurity(String[] people) {
        String found = "";

        for (int i = 0; i < people.length; i++) {
            if (found.equals("")) {
                if (people[i].equals("Done")) {
                    sendAlert();
                    found = "Done";
                }
                if (people[i].equals("John")) {
                    sendAlert();
                    found = "John";
                }
            }
        }

        someLaterCode(found);
    }

    private void someLaterCode(String found) {
        System.out.println(found);
    }

    private void sendAlert() {
        System.out.println("검색 완료");
    }
}
