package lv.javaguru.java1.student_pavels_zuriha.lesson_5.lessoncode;

class Calculator {


    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    boolean notEven(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    int findAverage(int number1, int number2) {
        int average = (number1 + number2) / 2;
        return average;
    }

    int findMax(int number1, int number2) {
        if (number1 > number2) {
            int findMax = number1;
            return findMax;
        } else if (number2 > number1) {
            int findMax = number2;
            return findMax;
        } else {
            return number1;
        }
    }

    int maxOfThreeNumber(int number1, int number2, int number3) {
        if ((number1 >= number2) && (number1 >= number3)) {
            int findMax = number1;
            return findMax;
        } else if ((number2 >= number1) && (number2 >= number3)) {
            int findMax = number2;
            return findMax;
        } else {
            return number3;
        }

    }
}

    class CalculatorApp {
        public static void main(String[] args) {

            Calculator calculator = new Calculator();

            System.out.println("Number is even ? " + calculator.isEven(8));
            System.out.println("Number is even ? " + calculator.isEven(9));
            System.out.println("Number is even ? " + calculator.isEven(11));
            System.out.println("Number is even ? " + calculator.isEven(12));
            System.out.println("Number is Odd ? " + calculator.notEven(25));
            System.out.println("Number is Odd ? " + calculator.notEven(30));
            System.out.println("Number is Odd ? " + calculator.notEven(35));


            System.out.println("Average of numbers: " + calculator.findAverage(2, 4));
            System.out.println("Average of numbers: " + calculator.findAverage(10, 4));

            System.out.println("Max of Numbers: " + calculator.findMax(10, 5));
            System.out.println("Max of Numbers: " + calculator.findMax(5, 10));
            System.out.println("Max of Numbers: " + calculator.findMax(10, 10));
            System.out.println("Max of Numbers: " + calculator.findMax(20, 10));
            System.out.println("Max of Numbers: " + calculator.findMax(20, 20));
            System.out.println("Max of Numbers: " + calculator.findMax(20, 30));

            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(20, 30, 40));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(20, 30, 10));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(20, 5, 2));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(20, 20, 20));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(30, 30, 20));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(30, 40, 40));
            System.out.println("Max of Numbers of Three: " + calculator.maxOfThreeNumber(30, 40, 30));

        }
    }

