package lv.javaguru.java1.student_artem_galustan.lesson4.homework;

import java.util.Scanner;

public class EvenOrOddRequest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        int Number = scanner.nextInt();


        if(Number %2 == 0){
            System.out.println("Число " + Number + " является четным.");
        } else {
            System.out.println("Число " + Number + " является нечетным.");
        }

        scanner.close();


        }
    }

