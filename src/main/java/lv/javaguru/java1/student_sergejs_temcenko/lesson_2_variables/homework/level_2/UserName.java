package lv.javaguru.java1.student_sergejs_temcenko.lesson_2_variables.homework.level_2;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = name.nextLine();

        System.out.println("Hello " + userName);
    }
}
