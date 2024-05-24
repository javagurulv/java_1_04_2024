package lv.javaguru.java1.student_jelena_k.lesson5;

import java.util.Scanner;

public class CalculatorApp {

    public static  void  main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
         int number = scanner.nextInt();

         Calculator calculator = new Calculator();
         boolean result = calculator.isEven(number);

         System.out.println("Result = " + result);
    }
}
