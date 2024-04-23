package lv.javaguru.java1.teacher.lesson_2_variables.lessoncode;

public class CalculatorDoubleInt {

    public static void main(String[] args) {

        int number1 = 100;
        int number2 = 200;

        double sum = number1 + number2;
        double multiply = number1 * number2;
        double divide = ((double) number1) / number2;
        double subtraction = number1 - number2;

        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + multiply);
        System.out.println("Divide = " + divide);
        System.out.println("Subtraction = " + subtraction);
    }

}
