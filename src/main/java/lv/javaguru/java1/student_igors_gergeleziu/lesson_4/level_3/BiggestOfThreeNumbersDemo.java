package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_3;

import java.util.Scanner;

class BiggestOfThreeNumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiggestOfThreeNumbers biggestOfThreeNumbers = new BiggestOfThreeNumbers();
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Biggest of three numbers: " + biggestOfThreeNumbers.findMaxNumber(firstNumber, secondNumber, thirdNumber));
    }
}
