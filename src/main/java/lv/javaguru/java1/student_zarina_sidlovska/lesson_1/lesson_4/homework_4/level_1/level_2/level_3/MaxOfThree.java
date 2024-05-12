package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2.level_3;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//три целых числа и выводит на консоль наибольшее из них.
//
//PS: перед решением этой задачи распишите на бумаге
//или в комментарии все возможные варианты (комбинации).
//Это поможет вам правильно написать программу!
//Нельзя пользоваться классом Math.
class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert first number: ");
        int a = scanner.nextInt();
        System.out.println("Please insert second number ");
        int b = scanner.nextInt();
        System.out.println("Please insert third number ");
        int c = scanner.nextInt(); {
            if (a > b && a > c) {
                System.out.println("Biggest number is " + a);
            } else if (b > c) {
                System.out.println("Biggest number is " + b);

            } else {
                System.out.println("Biggest number is " + c);
            }
        }
    }
}
