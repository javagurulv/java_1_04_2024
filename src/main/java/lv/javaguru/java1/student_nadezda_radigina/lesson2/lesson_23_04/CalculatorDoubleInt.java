package lv.javaguru.java1.student_nadezda_radigina.lesson2.lesson_23_04;

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
