package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.lessoncode;

class BankAccount {

    private String owner;
    private int money;


    public BankAccount(String owner, int money) { //konstruktor s dvumja svoistvami.
        this.owner = owner;
        this.money = money;
    }

    public BankAccount(String owner) {
        this.owner = owner;
        this.money = 0; //etomu svoistvu dobavili znacenie 0 po umolcaniju.

    }

    public BankAccount(int money) { //konstrukrot dlja odnogo svoistva.
        this.money = money;
    }

    public String getOwner() { //metod vide dejstvija.
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) { //metod nicego nevozrasaet a tolko izmenjaet znacenie money.
        this.money = money;
    }

    public void addMoney(int money) {
        this.money = this.money + money;
    }

    public void subMoney(int money) {
        this.money = this.money - money;

    }

}
