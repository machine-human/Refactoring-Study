package com.chapter10.separatequeryfrommodifier.after;

//상태 변경 메서드와 값 반환 메서드를 분리
public class Example01 {
    void checkSecurity(String[] people) {
        //변경 메서드를 먼저 호출한 후 값 반환 메서드를 호출하게 변경
        sendAlert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }

    private void someLaterCode(String found) {
    }

    //상태 변경 메서드
    void sendAlert(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (!foundPerson(people).equals("")) {
                sendAlert();
            }
        }
    }

    //값 반환 메서드
    //부작용이 없는 적절한 질의 메서드
    String foundPerson(String[] people) {
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
