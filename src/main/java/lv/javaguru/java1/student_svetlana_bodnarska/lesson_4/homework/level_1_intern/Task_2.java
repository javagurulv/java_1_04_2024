package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class Task_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even number");
        } else if (number % 2 == 1) {
            System.out.println("Odd number");
        }
    }
}
