package lv.javaguru.java1.student_anton_pereloma.lesson_3.lessoncode;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){
        BankAccount bankAccount_1 = new BankAccount("Vasja", 1);
        BankAccount bankAccount_2 = new BankAccount("Ivan", 2);
        BankAccount bankAccount_3 = new BankAccount("Pyotr", 3);
        BankAccount bankAccount_4 = new BankAccount("Stasik");
        BankAccount bankAccount_5 = new BankAccount(100);
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter owner: ");
//        String owner = scanner.nextLine();

//        System.out.println("Enter money: ");
//        int money = scanner.nextInt();

//        BankAccount bankAccount_6 = new BankAccount(owner, money);
//        String owner1 = bankAccount_6.getOwner();
//        System.out.println("Owner: " + owner1);
        System.out.println("Owner: " + bankAccount_3.getOwner());
        System.out.println("Money: " + bankAccount_3.getMoney());

        bankAccount_3.setMoney(18765);
        System.out.println("Money: " + bankAccount_3.getMoney());
        bankAccount_3.subtractMoney(1111);
        System.out.println("Money: " + bankAccount_3.getMoney());


    }
}
