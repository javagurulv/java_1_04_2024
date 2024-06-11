package lv.javaguru.java1.student_eyheni_salmin.lesson_1;

public class Multiplicator {
    public static void main(String[] args) {
        printMultipl();
    }
    public static int getMultipl() {
        return Math.multiplyExact(50, 3);
    }
    public static void printMultipl() {
        System.out.println(getMultipl());
    }
}
