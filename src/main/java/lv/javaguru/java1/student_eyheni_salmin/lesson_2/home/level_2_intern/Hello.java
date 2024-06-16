package lv.javaguru.java1.student_eyheni_salmin.lesson_2.home.level_2_intern;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        sayHello();
    }
    public static void sayHello() {
        System.out.print("Напишите ваше имя:");
        System.out.println("Hello, " + new Scanner(System.in).next());
    }
}
