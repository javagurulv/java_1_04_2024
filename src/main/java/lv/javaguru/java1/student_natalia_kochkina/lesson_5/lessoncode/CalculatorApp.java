package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

import java.util.Scanner;

class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        boolean evenResult = calculator.isEven(number1);
        boolean oddResult = calculator.isOdd(number1);
        double averageResult = calculator.calculateAverage(number1, number2);
        int maxNumber = calculator.findMaxNumber(number1, number2);

        System.out.println("is even " + evenResult);
        System.out.println("is odd " + oddResult);
        System.out.println("average = " + averageResult);
        System.out.println("max number = " + maxNumber);
    }

}
