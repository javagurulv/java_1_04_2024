package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль:
//- "Numbers are equals" - если числа равны;
//- "Numbers are different" - если числа не равны.
//
//В решении воспользоваться оператором не равно (!=).
public class IsNumberEqualOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert number two different numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
