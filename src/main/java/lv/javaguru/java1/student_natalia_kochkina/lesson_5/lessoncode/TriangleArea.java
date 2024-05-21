package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

class TriangleArea {

    public double calculateSemiPerimeter(int number1,
                                         int number2,
                                         int number3) {
        return (number1 + number2 + number3) / 2.0;
    }

    public double calculateArea(int number1,
                                int number2,
                                int number3) {
        double p = calculateSemiPerimeter(number1, number2, number3);
        return Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }

}
