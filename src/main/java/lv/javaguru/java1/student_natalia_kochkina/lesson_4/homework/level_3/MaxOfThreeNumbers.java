package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_3;

import java.util.Scanner;

class MaxOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();

        if ((number1 >= number2) && (number1 >= number3)) {
            System.out.println("max number = " + number1);
        } else if ((number2 >= number1) && (number2 >= number3)) {
            System.out.println("max number = " + number2);
        } else {
            System.out.println("max number = " + number3);
        }
    }
}
