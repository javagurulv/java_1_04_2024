package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_2;

import java.util.Scanner;

class NumbersComparing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiggestOfTwoNumbers biggestNumber = new BiggestOfTwoNumbers();
        SmallestOfTwoNumbers smallestNumber = new SmallestOfTwoNumbers();
        EqualNumbers equalNumber = new EqualNumbers();

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Biggest number: " + biggestNumber.findBiggestNumber(firstNumber, secondNumber));
        System.out.println("Smallest number: " + smallestNumber.findSmallestNumber(firstNumber, secondNumber));
        System.out.println("Numbers are equal? " + equalNumber.checkEqualNumbers(firstNumber, secondNumber));

    }
}
