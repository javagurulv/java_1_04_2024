package lv.javaguru.java1.student_nadezda_radigina.lesson3.lesson_30_04;

import java.util.Scanner;

class BankAccountApplication {
     public static void main(String[] args){
         BankAccount bankAccount1 = new BankAccount("Vasja", 1);
         BankAccount bankAccount2 = new BankAccount(  "Petja",  2);
         BankAccount bankAccount3 = new BankAccount(  "Tanja",  3);


         BankAccount bankAccount4 = new BankAccount ("Katja");
         BankAccount bankAccount5 = new BankAccount ("Dima");


         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter owner: ");
         String owner = scanner.nextLine();

         System.out.println("Enter money: ");
         int money = scanner.nextInt();

         BankAccount bankAccount8 = new BankAccount(owner, money);

         String owner1 = bankAccount1.getOwner();
         System.out.println("Owner: " + owner1);

         String owner2 = bankAccount2.getOwner();
         System.out.println("Owner: " + owner2);

         int money3 = bankAccount3.getMoney();
         System.out.println("Money: " + money3);

         int money2 = bankAccount2.getMoney();
         System.out.println("Money: " + money2);

         bankAccount3.setMoney(18795);
         bankAccount4.setMoney(120345);
         System.out.println("BA 3 Money: " + bankAccount3.getMoney());
         System.out.println("BA 4 Money: " + bankAccount4.getMoney());

         BankAccount bankAccount9 = new BankAccount(200);
         bankAccount9.addMoney(300);
         System.out.println("BA 9 Money: " + bankAccount9.getMoney());


         BankAccount bankAccount10 = new BankAccount(200);
         bankAccount10.subMoney(100);
         System.out.println("BA 10 Money: " + bankAccount10.getMoney());

     }
}
