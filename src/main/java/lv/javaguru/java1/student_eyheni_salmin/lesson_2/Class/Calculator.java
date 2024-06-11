package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

public class Calculator {
    public static void main(String[] args) {

        printResult(100, 200);

    }
    public static int getNumSumm(int NumOne, int NumTwo) {
        return NumOne + NumTwo;
    }
    public static int getNumSubstr(int NumOne, int NumTwo) {
        return NumOne - NumTwo;
    }
    public static int getNumMultipl(int NumOne, int NumTwo) {
        return NumOne * NumTwo;
    }
    public static float getNumDivision(float NumOne, float NumTwo) {
        return NumOne / NumTwo;
    }

    public static void printResult(int NumOne, int NumTwo) {
        System.out.println("Сумма: " + getNumSumm(NumOne,NumTwo));
        System.out.println("Разность: " + getNumSubstr(NumOne,NumTwo));
        System.out.println("Произведение: " + getNumMultipl(NumOne,NumTwo));
        System.out.println("Частное: " + getNumDivision(NumOne,NumTwo));
    }
}
