package lv.javaguru.java1.student_anton_pereloma.lesson_2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter number: ");
        int b = scanner.nextInt();

        System.out.println("Enter number: ");
        int c = scanner.nextInt();

        double perimeter = (a + b + c) / (double) 2;
        System.out.println(perimeter);

        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) *(perimeter - c));
        System.out.println(area);
    }
}
