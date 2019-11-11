package com.chapter10.replaceerrorcodewithexception.after.Example01;

//에러 부호를 예외 통지로 교체
//미확인 예외
public class Account {
    private int balance = 10;

    public static void main(String[] args) {
        Account account = new Account();

        int amount = 11;
        if (!account.canWithdraw(amount)) {
            handleOverdrawn();
        } else {
            account.withdraw(amount);
            doTheUsualThing();
        }
    }

    private static void doTheUsualThing() {
        System.out.println("출금 가능");
    }

    private static void handleOverdrawn() {
        System.out.println("에러");
    }

    boolean canWithdraw(int amount) {
        if (balance > amount) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amount) {
        Assert.isTrue("잔액이 충분합니다.", amount <= balance);
        balance -= amount;
    }
}
