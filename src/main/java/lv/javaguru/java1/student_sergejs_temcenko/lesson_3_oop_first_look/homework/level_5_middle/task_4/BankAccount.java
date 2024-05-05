package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_5_middle.task_4;

class BankAccount { private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    int getMoneyAmount() {
        return this.moneyAmount;
    }

}
