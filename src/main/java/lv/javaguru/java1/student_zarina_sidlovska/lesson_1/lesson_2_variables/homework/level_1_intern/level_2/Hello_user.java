package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_2_variables.homework.level_1_intern.level_2;

import java.util.Scanner;

public class Hello_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your user name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name + "!");
    }
}

