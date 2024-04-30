package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

import java.util.Scanner;

class BankAccountApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount1 = new BankAccount("Vasja",1);
        BankAccount bankAccount2 = new BankAccount("Petja",2);
        BankAccount bankAccount3 = new BankAccount("Tanja",3);
        BankAccount bankAccount4 = new BankAccount ("Kirill");
        BankAccount bankAccount5 = new BankAccount (4);

        System.out.println("Enter money: ");
        int money = scanner.nextInt();

        System.out.println("Enter name: ");
        String owner = scanner.nextLine();


        BankAccount bankAccount6 = new BankAccount(owner, money);

         String owner1 = bankAccount6.getOwner();
         System.out.println(" BA 6 Owner: " + owner1);


        System.out.println(" BA 1 Owner: " + bankAccount1.getOwner());
        System.out.println(" BA 3 Owner: " + bankAccount3.getOwner());
        System.out.println(" BA 3 Money: " + bankAccount3.getMoney());
        System.out.println(" BA 5 Money: " + bankAccount5.getMoney());

        bankAccount3.setMoney(12345);
        bankAccount5.setMoney(99999);
        System.out.println(" BA 3 Money: " + bankAccount3.getMoney());
        System.out.println(" BA 5 Money: " + bankAccount5.getMoney());

        bankAccount2.addMoney(1);
        System.out.println(" BA 2 Money: " + bankAccount2.getMoney());

        bankAccount5.subMoney(1);
        System.out.println(" BA 5 Money: " + bankAccount5.getMoney());

    }
}
