package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

import java.util.Arrays;

class ArrayIntApp {

    public static void main(String[] args) {
        ArrayInt arr = new ArrayInt();
        int[] intArray = arr.generateArray( 15);
        System.out.println(Arrays.toString(intArray));

    }

}
