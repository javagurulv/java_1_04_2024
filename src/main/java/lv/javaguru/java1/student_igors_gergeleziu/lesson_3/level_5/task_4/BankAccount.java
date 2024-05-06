package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_5.task_4;

class BankAccount {
    private String ownerFirstName;
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
        return this.ownerFirstName;
    }

    String getMoneyAmount() {
        return "" + this.moneyAmount;
    }

}
