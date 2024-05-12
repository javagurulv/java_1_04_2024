package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_3_junior;

import java.util.Scanner;

class GreaterOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable X:");
        int x = scanner.nextInt();
        System.out.println("Enter the second variable Y:");
        int y = scanner.nextInt();
        System.out.println("Enter the third variable Z:");
        int z = scanner.nextInt();
        if ((x > y) && (x > z)) {
            System.out.println("X is the greatest number");
        } else if ((y > x) && (y > z)) {
            System.out.println("Y is the greatest number");
        } else if ((z > x) && (z > y)) {
            System.out.println("Z is the greatest number");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
