package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_2;

import java.util.Scanner;

class LowerNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter second number: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(y + " is Lower");
        }
        else if (x < y) {
            System.out.println(x + " is Lower");
        }
        else {
            System.out.println("Numbers are even");
        }
    }
}
