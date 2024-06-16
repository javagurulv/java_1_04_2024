package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

public class BankAccount {

    private String owner;
    private int money;

    public BankAccount() {

    }

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
        return owner;
    }
    public int getMoney() {
        return money;
    }
    public void setOwner(String owner) {
        this.owner = owner;
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
