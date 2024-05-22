package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_3;

import java.util.Arrays;

class ArrayZeroTest {

    public static void main(String[] args) {
        ArrayZeroTest test = new ArrayZeroTest();
        test.arrayZeroTest();

    }

    public void arrayZeroTest() {
        ArrayZero arrayZero = new ArrayZero();
        int[] result = arrayZero.arrayZero();
        int[] expectedResult = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        if (Arrays.equals(result, expectedResult)) {
            System.out.println("Test OK");
            System.out.println("Result: " + Arrays.toString(result));
        } else {
            System.out.println("Test FAIL");
            System.out.println("Real result:" + Arrays.toString(result));
            System.out.println("Expected result:" + Arrays.toString(expectedResult));
        }

    }
}
