package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

import java.util.Scanner;

class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Calculator calculator = new Calculator();
        boolean evenResult = calculator.isEven(number);
        boolean oddResult = calculator.isOdd(number);

        System.out.println("Is even = " + evenResult);
        System.out.println("Is odd = " + oddResult);
    }

}
