package com.chapter10.replaceerrorcodewithexception.after.Example02;

//에러 부호를 예외 통지로 교체
//확인된 예외
public class Account {
    private int balance = 10;

    public static void main(String[] args) {
        Account account = new Account();
        int amount = 11;
        try {
            account.withdraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            handleOverdrawn();
        }
    }

    private static void doTheUsualThing() {
        System.out.println("출금 가능");
    }

    private static void handleOverdrawn() {
        System.out.println("에러");
    }

    void withdraw(int amount) throws BalanceException {
        if (amount > balance) {
            throw new BalanceException();
        } else {
            balance -= amount;
        }
    }
}
