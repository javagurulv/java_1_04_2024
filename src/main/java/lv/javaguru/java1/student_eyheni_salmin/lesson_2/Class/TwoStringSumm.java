package lv.javaguru.java1.student_eyheni_salmin.lesson_2.Class;

public class TwoStringSumm {

    public static void main(String[] args) {

        printWordSumm("One", "Two");

    }

    public static String getWordSumm(String WordOne, String WordTwo) {
        return "Первое  слово: " + WordOne + " и второе слово: "+ WordTwo;
    }

    public static void printWordSumm(String WordOne, String WordTwo) {
        System.out.println(getWordSumm(WordOne, WordTwo));
    }

}
