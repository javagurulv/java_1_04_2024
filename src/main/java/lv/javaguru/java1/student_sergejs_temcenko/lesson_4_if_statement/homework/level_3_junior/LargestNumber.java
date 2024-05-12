package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_3_junior;

import java.util.Scanner;

class LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println("Largest number 1: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Largest number 2: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Largest number 3: " + number3);
        } else {
            System.out.println("You must enter different numbers");
        }
    }
}
