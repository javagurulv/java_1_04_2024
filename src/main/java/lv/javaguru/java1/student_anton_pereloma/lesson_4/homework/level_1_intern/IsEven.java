package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class IsEven {
    public static void main(String[] args) {


        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is NOT even");
        }
    }
}
