package lv.javaguru.java1.student_nikita_paramonovs.lesson_7.level2;

import java.util.Random;

public class RandomIntArray {
public int[] createRandomArray() {
    int[] array = new int[10];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(101);
    }
    return array;
}
    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
