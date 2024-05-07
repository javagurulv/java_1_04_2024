package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_1;

import java.util.Scanner;

class EvenNotEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        int y = x % 2;

        if (y == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is not even");
        }
    }
}