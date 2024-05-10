package lv.javaguru.java1.student_pavels_zuriha.lesson_4.lessoncode;

import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int x = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("First Number is Greater " + x);
        } else if (x < y) {
            System.out.println("Second number is Greater " + y);
        } else {
            System.out.println("Numbers are equal");
        }




    }
}