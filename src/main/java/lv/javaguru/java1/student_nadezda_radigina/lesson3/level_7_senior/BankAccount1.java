package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class BankAccount1 {
     private String owner;
     private int money;

     BankAccount1(String owner, int money) {
         this.owner = owner;
         this.money = money;
     }

     String getOwner() {
         return this.owner;
     }

     int getMoney() {
         return this.money;
     }
}
