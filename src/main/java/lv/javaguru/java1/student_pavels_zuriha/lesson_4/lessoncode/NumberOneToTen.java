package lv.javaguru.java1.student_pavels_zuriha.lesson_4.lessoncode;

import java.util.Scanner;

class NumberOneToTen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = scanner.nextInt();

        if ((x >= 1) && (x <=10)) {
            System.out.println("Number is between 1 and 10");
        } else {
            System.out.println("Number is out of scope");
        }

    }
}

