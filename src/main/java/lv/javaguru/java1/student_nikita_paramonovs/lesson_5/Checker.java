package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;


import java.util.Scanner;

class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("number " + number + " even.");
        } else {
            System.out.println("number " + number + " odd.");
        }
    }
}
