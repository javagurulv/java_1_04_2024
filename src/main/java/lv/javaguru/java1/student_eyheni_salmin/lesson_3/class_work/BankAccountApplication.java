package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

import java.util.Scanner;

public class BankAccountApplication {


    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasia", 1);
        BankAccount bankAccount2 = new BankAccount("Vas", 2);
        BankAccount bankAccount3 = new BankAccount("Vasi", 3);
        BankAccount bankAccount4 = new BankAccount("Vasi");
        BankAccount bankAccount5 = new BankAccount( 3);
        System.out.println("Владелец: " + bankAccount1.getOwner());
        System.out.println("Тут получим null: " + bankAccount5.getOwner());
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();

        BankAccount bankAccount = new BankAccount(money);

        System.out.println(bankAccount4.getMoney());
        bankAccount4.setMoney(5);

        System.out.println(bankAccount4.getMoney());

        bankAccount4.addMoney(money);
        System.out.println(bankAccount4.getMoney());
        bankAccount4.subMoney(money);
        System.out.println(bankAccount4.getMoney());

    }


}
