package lv.javaguru.java1.student_anton_pereloma.lesson_7.lessoncode;

import java.lang.reflect.Array;

class PrintNumbersTest {
    public static void main(String[] args) {
        PrintNumbersTest test = new PrintNumbersTest();
        test.checkForLoopTest();

    }
    public void checkForLoopTest() {
        PrintNumbers printNumbers = new PrintNumbers();
        String result = printNumbers.printNumbers(10);
        if (result.equals("1 2 3 4 5 6 7 8 9 10 ")) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Test FAIl!");

        }
    }
}
