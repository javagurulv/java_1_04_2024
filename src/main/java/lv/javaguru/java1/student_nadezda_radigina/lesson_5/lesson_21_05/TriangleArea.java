package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_21_05;

 class TriangleArea {

    double semiperimeter (int number1, int number2, int number3){
        return (double) (number1 + number2 + number3) / 2;
    }

    double calculateArea (int number1, int number2, int number3){
        double p = semiperimeter(number1,  number2, number3);
        return Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }
}
