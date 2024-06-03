package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_2;

import java.util.Random;

class RandomIntArray {

    int[] createArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
