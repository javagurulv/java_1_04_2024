package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_2;

class BankAccount {
    private String owner;
    private int money;

    BankAccount(int moneyAmount) {
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
