package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_3_junior;

 class TaxApp {
     public static void main(String[] args){
         Tax tax = new Tax();
         System.out.println(tax.taxRate(1000));
         System.out.println(tax.taxRate(20000));
         System.out.println(tax.taxRate(35000));
         System.out.println(tax.taxRate(60000));
         System.out.println(tax.taxRate(-30));
         System.out.println(tax.taxRate(0));
         System.out.println();

         if(tax.taxRate(0)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(0));
         }
         if(tax.taxRate(1000)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(1000));
         }
         if(tax.taxRate(20000)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(20000));
         }
         if(tax.taxRate(35000)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(35000));
         }
         if(tax.taxRate(60000)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(60000));
         }
         if(tax.taxRate(-30)==0.0){
             System.out.println("Error");
         } else {
             System.out.println(tax.taxRate(-30));
         }
     }


}
