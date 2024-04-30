package lv.javaguru.java1.student_nikita_paramonovs.lesson_2;

import java.util.Locale;
import java.util.Scanner;

public class circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("enter radius:  ");

        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Perimeter: " + perimeter);

        System.out.println("Area: " + area);

    }
}
