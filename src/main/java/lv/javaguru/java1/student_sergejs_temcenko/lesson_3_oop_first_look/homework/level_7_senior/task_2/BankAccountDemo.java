package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_2;

 class BankAccountDemo {
     public static void main(String[] args) {
         BankAccount bankAccount = new BankAccount(100000);
         String owner = bankAccount.getOwner();
         int money = bankAccount.getMoney();
         System.out.println("Owner = " + owner);
         System.out.println("Money = " + money);
     }

 }
