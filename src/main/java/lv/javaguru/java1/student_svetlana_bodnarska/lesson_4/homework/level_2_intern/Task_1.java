package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class Task_1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two even numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

    if (number1 > number2){
        System.out.println(number1);
    } else if (number2 > number1) {
        System.out.println(number2);
    }
    }
}
