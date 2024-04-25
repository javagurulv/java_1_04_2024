package lv.javaguru.java1.student_igors_gergeleziu.lesson_2.level_3;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        float radius=scanner.nextFloat();
        System.out.println("Perimeter: "+2*Math.PI*radius);
        System.out.println("Area: "+Math.PI*Math.pow(radius, 2));
    }
}
