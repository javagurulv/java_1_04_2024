package lv.javaguru.java1.student_maksims_latkovskis.lesson_1.homework.level2;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Initialising scanner

        System.out.println("Please enter your name:");
        String UserName = scanner.nextLine();

        System.out.println("Hello, " + UserName + "!");

    }

}
