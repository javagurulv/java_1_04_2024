package lv.javaguru.java1.student_artem_galustan.lesson7.homework;


import java.util.Random;

public class RandomIntArray {

    public static int[] RandomIntArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public class RandomIntArrayPrinter {

        public static void printIntArray(int[] array) {
            for (int number : array) {
                System.out.println(number);
            }
        }
    }

}