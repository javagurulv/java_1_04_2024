package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.lesson;

public class Calculator {
      // can type ps + enter will return public static void
       public static void main(String[] args) {

           int number1 = 10 ;
           int number2 = 15 ;

           int sum = number1 + number2 ;
           int subtract = number2 - number1 ;
           /// converted int to double and then divided by int result will be double
           double divide = (double) number2 / number1 ;
//         int divide = number2 / number1 ;
           int multiply = number1 * number2;

           System.out.println("Sum = " + sum ) ;
           System.out.println("Subtract = " + subtract ) ;
           System.out.println("Divide = " + divide ) ;
           System.out.println("Multiply = " + multiply ) ;

       }
}
