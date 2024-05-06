package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class BankAccount {

    private String owner;
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.money = 0;
    }

    public BankAccount(String owner, int money) {
        this.owner = owner;
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

    public void subMoney(int money) {
        this.money = this.money - money;
    }

}
