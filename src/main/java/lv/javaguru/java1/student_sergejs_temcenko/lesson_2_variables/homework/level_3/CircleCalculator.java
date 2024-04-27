package lv.javaguru.java1.student_sergejs_temcenko.lesson_2_variables.homework.level_3;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {

        // Enter the radius of the circle
        Scanner newObject = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = newObject.nextDouble();

        // Perimeter and Area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);


        System.out.println(perimeter);
        System.out.println(area);

    }


}
