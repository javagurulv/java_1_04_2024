package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_2;

import java.util.Arrays;

class RandomIntArray {

    public int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 100 ) + 1; // random int between 0 and 100
            array[i] = randomNumber;
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
