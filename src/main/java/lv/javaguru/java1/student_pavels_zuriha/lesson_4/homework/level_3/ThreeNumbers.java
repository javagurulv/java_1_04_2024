package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_3;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter third number: ");
        int z = scanner.nextInt();

        if (x >= y && x >= z ) {
            System.out.println(x + " max number");
        }
        else if (y >= x && y >= z) {
            System.out.println(y + " max number");
        }
        else {
            System.out.println(z + " max number");
        }


        /* if ( x != y) {
            if (x > y) {
                if (x != z) {
                    if (x > z) {
                        System.out.println(x + " Number is the Greatest");
                    }
                    else {
                        System.out.println(z + " Number is the Greatest");
                    }
                }
                else {
                    System.out.println(x + " Number is the Greatest");
                }
            }
            else if (y != z) {
                if (y > z) {
                    System.out.println(y + " Number is the Greatest");
                }
                else {
                    System.out.println(z + " Number is the Greatest");
                }
            }
            else {
                System.out.println (y + " Number is the Greatest");
            }
        }
        else if ( x != z) {
            if (x > z) {
                System.out.println(x + " Number is the Greatest");
            }
            else {
                System.out.println(z + " Number is the Greatest");
            }
        }
        else {
            System.out.println("Numbers are equal");
        }
       */
    }
}
