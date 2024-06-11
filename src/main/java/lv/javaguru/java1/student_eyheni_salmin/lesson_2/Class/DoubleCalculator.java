package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

public class DoubleCalculator {
    public static void main(String[] args) {

        printResult(1.5, 2.7);

    }
    public static double getNumSumm(double NumOne, double NumTwo) {
        return NumOne + NumTwo;
    }
    public static double getNumSubstr(double NumOne, double NumTwo) {
        return NumOne - NumTwo;
    }
    public static double getNumMultipl(double NumOne, double NumTwo) {
        return NumOne * NumTwo;
    }
    public static double getNumDivision(double NumOne, double NumTwo) {
        return NumOne / NumTwo;
    }

    public static void printResult(double NumOne, double NumTwo) {
        System.out.println("Сумма: " + getNumSumm(NumOne,NumTwo));
        System.out.println("Разность: " + getNumSubstr(NumOne,NumTwo));
        System.out.println("Произведение: " + getNumMultipl(NumOne,NumTwo));
        System.out.println("Частное: " + getNumDivision(NumOne,NumTwo));
    }
}
