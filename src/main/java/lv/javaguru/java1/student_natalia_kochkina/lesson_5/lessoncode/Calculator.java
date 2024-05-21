package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

class Calculator {

    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public boolean isOdd(int number) {
        return (number % 2) != 0;
    }

    public double calculateAverage(int number1, int number2) {
        return (number1 + number2) / 2.0;
    }

    public int findMaxNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
