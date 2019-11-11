package com.chapter10.replaceerrorcodewithexception.before.Example01;

//에러 부호를 예외 통지로 교체
//미확인 예외
public class Account {
    private int balance = 10;

    public static void main(String[] args) {
        Account account = new Account();

        int amount = 11;
        if (account.withdraw(amount) == -1) {
            handleOverdrawn();
        } else {
            doTheUsualThing();
        }
    }

    private static void doTheUsualThing() {
        System.out.println("출금 가능");
    }

    private static void handleOverdrawn() {
        System.out.println("에러");
    }

    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}
