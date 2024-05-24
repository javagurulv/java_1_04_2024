package lv.javaguru.java1.student_pavels_zuriha.lesson_5.lessoncode;

import static java.lang.Math.sqrt;

class TriangleArea {

    double triangleArea(int number1, int number2, int number3) {
        double p = (double) (number1 + number2 + number3) / 2;
        double area = sqrt(p * (p-number1)*(p-number2)*(p-number3));

        return area;
    }

    double semiPerimeter(int number1, int number2, int number3) {
        return (double) (number1 + number2 + number3) / 2;
    }

    double area(int number1, int number2, int number3) {
        double p = semiPerimeter(number1,number2,number3);
        return sqrt(p * (p - number1) * (p-number2) * (p - number3));
    }
}

class TriangleAreaApp {
    public static void main (String[] args) {

        TriangleArea triangle = new TriangleArea();

        System.out.println("Area of Triangle: " + triangle.triangleArea(2,3,4));
        System.out.println("Area of Triangle: " + triangle.area(2,3,4));
        System.out.println("Area of Triangle: " + triangle.triangleArea(10,5,7));
        System.out.println("Area of Triangle: " + triangle.triangleArea(5,6,7));
        System.out.println("Area of Triangle: " + triangle.triangleArea(20,50,100));
    }
}
