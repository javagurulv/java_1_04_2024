package lv.javaguru.java1.student_maksims_latkovskis.lesson_2_variables.homework.level_3_junior;

import java.util.Scanner;
import java.lang.Math;

public class CircleParameters {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter circle radius:");
        double CircleRadius = scanner.nextDouble();

        //Checking if the value is of the valid range
        while(CircleRadius<0){
            System.out.println("Please enter positive circle radius:");
            CircleRadius = scanner.nextInt();
        }

        //double Pi = 3.141592; // Declaring constant Pi
        double CirclePerimeter = 2*Math.PI*CircleRadius;
        double CircleArea = Math.PI*CircleRadius*CircleRadius;

        System.out.println("Perimeter is = " + CirclePerimeter);
        System.out.println("Area is = " + CircleArea);
    }

}
