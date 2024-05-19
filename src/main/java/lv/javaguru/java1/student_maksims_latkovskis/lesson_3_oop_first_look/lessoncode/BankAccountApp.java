package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

class BankAccountApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount1 = new BankAccount("Bob",5);
        BankAccount bankAccount2 = new BankAccount("John",15);
        BankAccount bankAccount3 = new BankAccount("Richard",0);

        BankAccount bankAccount4 = new BankAccount("George");
        BankAccount bankAccount5 = new BankAccount(4);

        System.out.println("Please input Name:");
        String owner = scanner.nextLine();
        System.out.println("Please input Balance:");
        int balance = scanner.nextInt();

        BankAccount bankAccount6 = new BankAccount(owner, balance);

        System.out.println("Name is: " + bankAccount6.getOwner());
        System.out.println("Balance is: " + bankAccount6.getBalance());

        bankAccount6.addBalance(9999);

        bankAccount5.subtBalance(1111);
        System.out.println("Balance is: " + bankAccount5.getBalance());
        System.out.println("Balance is: " + bankAccount6.getBalance());



    }

}
