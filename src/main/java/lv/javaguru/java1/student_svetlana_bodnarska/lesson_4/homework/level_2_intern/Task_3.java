package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_2_intern;

import java.util.Scanner;

class Task_3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter two even numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1 == number2){
            System.out.println("Numbers are equals");
        } else if(number1 != number2){
            System.out.println("Numbers are different");

        }
    }
}
