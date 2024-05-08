package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_1;

import java.util.Scanner;

class EvenOrOddNumbersDemo {
    public static void main(String[] args) {
        EvenOrOddNumbers test = new EvenOrOddNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Number " + number + " is " + test.checkNumber(number));
    }
}
