package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

public class TwoNumSumm {

    public static void main(String[] args) {

        printSumm(100, 200);
        System.out.println(Integer.sum(100, 200));
    }

    public static int getSumm(int OneNum, int TwoNum) {
        return Integer.sum(OneNum, TwoNum);
    }

    public static void printSumm(int OneNum, int TwoNum) {
        System.out.println(getSumm(OneNum, TwoNum));
    }
}
