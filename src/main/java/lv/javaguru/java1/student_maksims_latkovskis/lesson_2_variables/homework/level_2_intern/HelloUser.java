package lv.javaguru.java1.student_maksims_latkovskis.lesson_2_variables.homework.level_2_intern;

import java.util.Scanner;
class HelloUser {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // Initialising scanner

        System.out.println("Please enter your name:");
        String UserName = scanner.nextLine();

        System.out.println("Hello, " + UserName + "!");

    }

}
