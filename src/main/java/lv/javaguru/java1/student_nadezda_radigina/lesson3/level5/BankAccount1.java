package lv.javaguru.java1.student_nadezda_radigina.lesson3.level5;

 class BankAccount1 {
     private String ownerFirstName;
     private String ownerLastName;
     private int moneyAmount;

     BankAccount1(String ownerFirstName, String ownerLastName, int moneyAmount) {
         this.ownerFirstName = ownerFirstName;
         this.ownerLastName = ownerLastName;
         this.moneyAmount = moneyAmount;
     }

     String getOwnerFirstName(){
         return this.ownerFirstName;
     }

     String getOwnerLastName() {
         return this.ownerLastName;
     }

     int getMoneyAmount(){
         return this.moneyAmount;
     }
}
