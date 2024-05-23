package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

class Calculator {

    boolean isEven(int number) {
        return (number % 2) == 0;
    }

    boolean isOdd(int number) {
        return (number % 2) != 0;
    }

    double calculateAverage(int number1, int number2) {
        return (number1 + number2) / 2.0;
    }

    int findMaxNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
