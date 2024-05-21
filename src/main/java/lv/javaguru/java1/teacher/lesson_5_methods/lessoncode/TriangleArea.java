package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class TriangleArea {

    double semiPerimeter(int number1,
                         int number2,
                         int number3) {
        return (double) (number1 + number2 + number3) / 2;
    }

    double calculateArea(int number1,
                         int number2,
                         int number3) {
        double p = semiPerimeter(number1, number2, number3);
        return Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }

}
