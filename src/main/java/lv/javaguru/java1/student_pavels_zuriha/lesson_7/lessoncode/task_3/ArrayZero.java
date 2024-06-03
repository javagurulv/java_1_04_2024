package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_3;

import java.util.Arrays;

class ArrayZero {

    public int[] arrayZero() {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;

    }

    public static void main(String[] args) {
        ArrayZero arrayZero = new ArrayZero();
        System.out.println(Arrays.toString(arrayZero.arrayZero()));

    }
}
