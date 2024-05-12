package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//целое число и выводит на консоль чётное оно или нет.
//
//Подсказка: используйте для определения чётное число или нет
//операцию остаток от деления (%). Если остаток от деления на 2
//равен нулю, то число чётное, иначе не чётное.
class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert number: ");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Number is even ");
        } else {
            System.out.println("Number is odd ");
        }
    }
}
