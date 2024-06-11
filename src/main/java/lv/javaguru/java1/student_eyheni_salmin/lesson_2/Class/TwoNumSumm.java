package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

public class TwoNumSumm {

    public static void main(String[] args) {

        printSumm(100, 200);
        System.out.println(Integer.sum(100, 200));
    }

    public static int getSumm(int NumOne, int NumTwo) {
        return Integer.sum(NumOne, NumTwo);
    }

    public static void printSumm(int NumOne, int NumTwo) {
        System.out.println(getSumm(NumOne, NumTwo));
    }
}
