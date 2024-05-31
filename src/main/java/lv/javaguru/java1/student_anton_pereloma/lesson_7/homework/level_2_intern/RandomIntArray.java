package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_2_intern;

import java.util.Random;

class RandomIntArray {

    int[] generateArray(int numberOfItems) {
        return new int[numberOfItems];
    }

    int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10);
    }

    void addNumbersToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomNumber = generateRandomNumber();
            array[i] = randomNumber;
        }
    }
    void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
