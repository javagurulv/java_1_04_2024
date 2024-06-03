package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class Factorial {

    public static void main(String[] args) {

        int number1 = 3;
        int number2 = 6;

        System.out.println("Number " + number1);
        System.out.println("(Loop method) Factorial = " + factorialLoop(number1));
        System.out.println("(Recursive method) Factorial = " + factorialRecursive(number1));

        System.out.println("Number " + number2);
        System.out.println("(Loop method) Factorial = " + factorialLoop(number2));
        System.out.println("(Recursive method) Factorial = " + factorialRecursive(number2));

    }

    private static int factorialLoop(int number) {
        int result = 1 ;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static int factorialRecursive(int number){
        if (number != 0) {
            return number * factorialRecursive(number - 1);
        }  else {
            return 1;
        }
    }

}
