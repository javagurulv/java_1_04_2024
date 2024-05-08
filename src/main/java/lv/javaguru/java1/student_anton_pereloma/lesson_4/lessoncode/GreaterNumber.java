package lv.javaguru.java1.student_anton_pereloma.lesson_4.lessoncode;

import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        } else if (number1 < number2) {
            System.out.println("Biggest number is " + number2);
        } else {
            System.out.println("They are equal");
        }

    }

}