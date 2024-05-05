package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount1 bankAccount = new BankAccount1("Viktor", 100000);
        String owner = bankAccount.getOwner();
        int money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }
}
