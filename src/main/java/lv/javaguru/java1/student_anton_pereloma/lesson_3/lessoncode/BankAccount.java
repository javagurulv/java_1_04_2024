package lv.javaguru.java1.student_anton_pereloma.lesson_3.lessoncode;

import java.util.Scanner;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }
    public BankAccount(int money) {
        this.money = money;
    }

    public String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money = this.money + money;
    }

    public void subtractMoney(int money) {
        this.money = this.money - money;
    }

}





