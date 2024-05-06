package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

class BankAccountApplication {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Sergejs", 100);
        BankAccount bankAccount2 = new BankAccount("Madara", 200);
        BankAccount bankAccount3 = new BankAccount("Anna", 300);

        BankAccount bankOwner1 = new BankAccount("Nik");
        BankAccount bankOwner2 = new BankAccount("Anton");

        BankAccount bankMoney1 = new BankAccount(20);

        Scanner newObject = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String owner = newObject.nextLine();

        System.out.println("Enter money: ");
        int money = newObject.nextInt();

        BankAccount bankAccount4 = new BankAccount(owner, money);

        System.out.println("Bank ak8 Owner: " + bankAccount4.getOwner() + " Bank ak8 money: " + bankAccount4.getMoney());


        bankAccount3.setMoney(2000);
        bankAccount1.setMoney(300);

        System.out.println("bank akk3 money : " + bankAccount3.getMoney());
        System.out.println("bank akk1 money : " + bankAccount1.getMoney());

        bankAccount3.subMoney(1000);
        System.out.println("bank3 " + bankAccount3.getMoney());
    }
}
