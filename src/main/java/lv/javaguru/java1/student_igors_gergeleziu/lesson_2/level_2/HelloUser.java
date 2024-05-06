package lv.javaguru.java1.student_igors_gergeleziu.lesson_2.level_2;

import java.util.Scanner;

class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
