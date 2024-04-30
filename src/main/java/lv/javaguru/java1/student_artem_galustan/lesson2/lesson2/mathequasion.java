package lv.javaguru.java1.student_artem_galustan.lesson2.lesson2;


import java.util.Scanner;

public class mathequasion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = scanner.nextInt();

        System.out.println("result" + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}