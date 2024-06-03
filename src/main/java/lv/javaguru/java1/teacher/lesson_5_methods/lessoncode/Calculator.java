package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class Calculator {

    boolean isEven(int number) {
        return (number % 2) == 0;
    }

    boolean isOdd(int number) {
        return (number % 2) != 0;
    }

    int findAverage(int number1, int number2) {
        int sum = number1 + number2;
        return sum / 2;

        //return (number1 + number2) / 2;
    }

    double findAverageDouble(int number1, int number2) {
        int sum = number1 + number2;
        return (double) sum / 2;
    }

}
