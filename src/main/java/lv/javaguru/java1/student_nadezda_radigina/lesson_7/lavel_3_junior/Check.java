package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lavel_3_junior;

 class Check {

     private int checkNumber;
     private double purchaseAmount;

     public Check (int checkNumber, double purchaseAmount){
         this.checkNumber = checkNumber;
         this.purchaseAmount = purchaseAmount;
     }

     public int getCheckNumber(){
         return checkNumber;
     }
     public double getPurchaseAmount(){
         return purchaseAmount;
     }
}
