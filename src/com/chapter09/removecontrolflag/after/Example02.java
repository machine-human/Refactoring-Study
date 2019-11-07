package com.chapter09.removecontrolflag.after;

//제어 플래그 제거
//간단한 제어 플래그를 return 문으로 교체
public class Example02 {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    String foundMiscreant(String[] people) {
        //found 변수를 알아내는 코드를 메서드로 빼냄
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Done")) {
                sendAlert();
                return "Done";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void someLaterCode(String found) {
        System.out.println(found);
    }

    private void sendAlert() {
        System.out.println("검색 완료");
    }
}
