package lv.javaguru.java1.student_igors_gergeleziu.lesson_1.level_6;

class ArithmeticalOperations {
    public static void main(String[] args) {
        ArithmeticalOperations arithmeticalOperations = new ArithmeticalOperations();
        System.out.println("Addition: 74+36 = " + arithmeticalOperations.addition(74, 36));
        System.out.println("Division: 50/3 = " + arithmeticalOperations.division(50, 3));
        System.out.println("Multiplication: 50*3 = " + arithmeticalOperations.multiplication(50, 3));
    }

    private int addition(int number1, int number2) {
        return number1 + number2;
    }

    private int division(int number1, int number2) {
        return number1 / number2;
    }

    private int multiplication(int number1, int number2) {
        return number1 * number2;
    }
}
