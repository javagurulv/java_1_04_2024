package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_1_intern;

 class FizzBuzzApp {
     public static void main(String[] args){
         FizzBuzz fizzBuzz = new FizzBuzz();
         System.out.println(fizzBuzz.isFizz(15));
         System.out.println(fizzBuzz.isFizz(18));
         System.out.println(fizzBuzz.isFizz(29));
         System.out.println(fizzBuzz.isFizz(45));
         System.out.println();

         System.out.println(fizzBuzz.isBuzz(15));
         System.out.println(fizzBuzz.isBuzz(18));
         System.out.println(fizzBuzz.isBuzz(29));
         System.out.println(fizzBuzz.isBuzz(45));
         System.out.println();

         System.out.println(fizzBuzz.isFizzBuzz(15));
         System.out.println(fizzBuzz.isFizzBuzz(18));
         System.out.println(fizzBuzz.isFizzBuzz(19));
         System.out.println(fizzBuzz.isFizzBuzz(45));

     }
}
