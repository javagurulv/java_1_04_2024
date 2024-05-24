package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

import java.util.Scanner;

class CalculatorApp {

    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           Calculator calculator = new Calculator();
           MaxNumber maxNumber = new MaxNumber();

           System.out.println("Please input number");
           int number = scanner.nextInt();
           calculator.isEvenNumber(number);
           calculator.isOddNumber(number);

           System.out.println("Please input number");
           number = scanner.nextInt();
           calculator.isEvenNumber(number);
           calculator.isOddNumber(number);

           System.out.println("Please input number1");
           int number1 = scanner.nextInt();

           System.out.println("Please input number2");
           int number2 = scanner.nextInt();

           double average = calculator.calculateAverage(number1, number2);
           System.out.println("Average number: " + average);

           double max = maxNumber.findMaxNumber(number1, number2);
           System.out.println("Max number: " + max);

           max = maxNumber.findMaxNumber(99,7,58);
           System.out.println("Max number: " + max);

    }
}
