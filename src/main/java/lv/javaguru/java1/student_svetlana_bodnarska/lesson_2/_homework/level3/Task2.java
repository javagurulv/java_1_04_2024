package lv.javaguru.java1.student_svetlana_bodnarska.lesson_2._homework.level3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter radius: ");
        double radius = scanner.nextDouble();
        final double Pi = 3.1415926536;
        double perimeter = 2 * Pi * radius;
        double area = Pi * radius * radius;
        System.out.println ("Perimeter is " + perimeter);
System.out.println ("Area is " + area);


    }

}
