package lv.javaguru.java1.student_maksims_latkovskis.lesson_2_variables.lessoncode;

import java.util.Scanner;
import java.lang.Math;

class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Triangle side length");
        int FirstSide = scanner.nextInt();
        System.out.println("Enter second Triangle side length");
        int SecondSide = scanner.nextInt();
        System.out.println("Enter third Triangle side length");
        int ThirdSide = scanner.nextInt();

        double HalfPerimeter = (double) (FirstSide+SecondSide+ThirdSide)/2; // Compute Half of perimeter
        // Use half-perimeter formula
        double TriangleArea=(HalfPerimeter*(HalfPerimeter-FirstSide)*(HalfPerimeter-SecondSide)*(HalfPerimeter-ThirdSide));
        TriangleArea=Math.sqrt(TriangleArea);
        System.out.println("Area of triangle is: "+ TriangleArea);

    }


}
