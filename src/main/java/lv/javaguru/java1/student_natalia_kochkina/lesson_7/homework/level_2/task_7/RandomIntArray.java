package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_2.task_7;

import java.util.Random;

class RandomIntArray {

    public int[] createArray() {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
