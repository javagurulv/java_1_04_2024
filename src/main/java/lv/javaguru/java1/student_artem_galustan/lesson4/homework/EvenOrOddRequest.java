package lv.javaguru.java1.student_artem_galustan.lesson4.homework;

import java.util.Scanner;

public class EvenOrOddRequest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("напиши 1 число: ");

        int Number = scanner.nextInt();
        int NumberTwo = scanner.nextInt();


        if(Number %2 == 0){
            System.out.println("Число " + NumberTwo + " является четным.");
        } else {
            System.out.println("Число " + NumberTwo + " является нечетным.");
        }

        scanner.close();


        }
    }

