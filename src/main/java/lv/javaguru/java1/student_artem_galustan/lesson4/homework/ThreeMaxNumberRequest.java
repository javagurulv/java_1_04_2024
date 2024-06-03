package lv.javaguru.java1.student_artem_galustan.lesson4.homework;

import java.util.Scanner;

public class ThreeMaxNumberRequest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int Number1 = scanner.nextInt();
        System.out.println("First Number is: " + Number1);
        System.out.println("Enter number: ");
        int Number2 = scanner.nextInt();
        System.out.println("Second Number is: " + Number2);
        System.out.println("Enter number: ");
        int Number3 = scanner.nextInt();
        System.out.println("Therd Number is: " + Number3);

        if (Number1 > Number2 && Number1 > Number3) {
            System.out.println("The Highest Number is " + Number1);
        } else if (Number2 > Number1 && Number2 > Number3) {
            System.out.println("The Highest Number is " + Number2);
        } else if (Number3 > Number1 && Number3 > Number2) {
            System.out.println("The Highest Number is " + Number3);
        } else {
            System.out.println("There is a tie or all numbers are equal.");
        }
    }
}
