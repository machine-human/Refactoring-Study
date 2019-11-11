package com.chapter10.separatequeryfrommodifier.before;

//상태 변경 메서드와 값 반환 메서드를 분리
public class Example01 {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }

    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }

            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    private void sendAlert() {
    }
}
