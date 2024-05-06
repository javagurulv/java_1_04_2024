package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class BankAccount {

    private String owner ;
    private int money ;

    ///// constructor for owner and money
    public BankAccount(String owner, int money) {
        this.owner = owner ;
        this.money = money ;
    }

    ///// constructor for owner only
    public BankAccount(String owner) {
        this.owner = owner ;
        this.money = 0 ;
    }

    ///// constructor for money only
    public BankAccount(int money) {
        this.owner = "" ;
        this.money = money ;
    }

    //// get owner name
    public String getOwner() {
        return this.owner ;
    }

    //// get money balance
    public int getMoney() {
        return this.money ;
    }

    //// set money balance
    public int setMoney(int money) {
        return this.money = money;
    }

    //// add money balance
    public void addMoney(int money) {
        this.money += money;
    }

    //// deduct money balance
    public void deductMoney(int money) {
        this.money -= money;
    }


}
