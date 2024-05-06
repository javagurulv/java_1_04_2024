package lv.javaguru.java1.student_natalia_kochkina.lesson_2.homework.level_2;

import java.util.Scanner;

class HelloUsername {

    //Task_2

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, please!");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
