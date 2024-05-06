package lv.javaguru.java1.student_igors_gergeleziu.lesson_2.level_3;

import java.util.Scanner;

class AverageArithmetical {
    public static void main(String[] args) {
        AverageArithmetical averageArithmetical = new AverageArithmetical();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int number3 = scanner.nextInt();

        System.out.println("Average arithmetical: " + averageArithmetical.calculate(number1, number2, number3));

    }

    float calculate(int number1, int number2, int number3) {
        return (float) (number1 + number2 + number3) / 3;
    }
}
