package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_1_intern;

 class FizzBuzzConverterAplication {


     public static void main(String[] args) {
         FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

         System.out.println("Division on 5 " + fizzBuzzConverter.divisionByFive(5));

         System.out.println(fizzBuzzConverter.convertToFizzBuzz(10));
         System.out.println(fizzBuzzConverter.convertToFizzBuzz(21));
         System.out.println(fizzBuzzConverter.convertToFizzBuzz(15));
     }
}
