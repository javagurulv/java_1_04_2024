package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.lessoncode;

class BankAccount {

    private String owner;
    private int balance;

    //Declaration options
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public BankAccount(String owner){
        this.owner=owner;
        this.balance = 0;
    }

    public BankAccount(int balance){
        this.balance=balance;
    }

    //Returns name of owner
    public String getOwner(){
        return this.owner;
    }
    //Returns account balance
    public int getBalance(){
        return this.balance;
    }
    public void addBalance(int balance){
        this.balance = this.balance + balance;
    }
    public void subtBalance(int balance){
        if(this.balance<balance){}
        else {
            this.balance = this.balance - balance;
        }
    }
}
