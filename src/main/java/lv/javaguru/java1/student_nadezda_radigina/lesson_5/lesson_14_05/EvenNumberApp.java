package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_14_05;

 class EvenNumberApp {
     public static void main(String[] args){
         int number = 10;
         boolean isEven = (number % 2) == 0;
         System.out.println("Number is even " + isEven);

         EvenNumber evenNumber = new EvenNumber();
         System.out.println("Number is even " + evenNumber.isEven(12));
         System.out.println("Number is even " + evenNumber.isEven(13));
         System.out.println("Number is even " + evenNumber.isEven(14));
         System.out.println("Number is even " + evenNumber.isEven(15));

  }
 }
