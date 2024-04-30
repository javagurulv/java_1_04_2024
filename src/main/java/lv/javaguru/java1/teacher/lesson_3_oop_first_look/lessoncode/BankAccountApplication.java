package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

class BankAccountApplication {

    // Runtime

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja", 1);
        BankAccount bankAccount2 = new BankAccount("Petja", 2);
        BankAccount bankAccount3 = new BankAccount("Tanja", 3);

        BankAccount bankAccount4 = new BankAccount("Sanita");
        BankAccount bankAccount5 = new BankAccount("Didzis");

        BankAccount bankAccount6 = new BankAccount(100);
        BankAccount bankAccount7 = new BankAccount(200);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter money: ");
        int money = scanner.nextInt();

        BankAccount bankAccount8 = new BankAccount(owner, money);

        String owner1 = bankAccount8.getOwner();
        System.out.println("BA 8 Owner: " + owner1);

        System.out.println("BA 1 Owner: " + bankAccount1.getOwner());
        System.out.println("BA 2 Owner: " + bankAccount2.getOwner());
        System.out.println("BA 3 Owner: " + bankAccount3.getOwner());
    }

}
