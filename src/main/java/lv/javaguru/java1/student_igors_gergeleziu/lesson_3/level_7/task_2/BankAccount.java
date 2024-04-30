package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_7.task_2;

class BankAccount {
    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return "" + this.money;
    }
}
