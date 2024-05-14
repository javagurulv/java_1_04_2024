package lv.javaguru.java1.student_natalia_kochkina.lesson_2.lessoncode;

class Calculator {

    public static void main(String[] args) {


        int number1 = 100;
        int number2 = 200;

        int additionResult = number1 + number2;
        int subtractionResult = number1 - number2;
        int multiplicationResult = number1 * number2;
        double divisionResult = ((double) number1) / number2;

        System.out.println("additionResult = " + additionResult);
        System.out.println("subtractionResult = " + subtractionResult);
        System.out.println("multiplicationResult = " + multiplicationResult);
        System.out.println("divisionResult = " + divisionResult);
    }
}
