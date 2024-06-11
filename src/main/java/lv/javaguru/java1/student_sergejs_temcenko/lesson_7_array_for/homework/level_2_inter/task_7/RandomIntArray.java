package lv.javaguru.java1.student_sergejs_temcenko.lesson_7_array_for.homework.level_2_inter.task_7;


import java.util.Random;

class RandomIntArray {

    int[] generateRandomArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

//    void printArray(int[] array) {
//        for(int number : array){
//            System.out.print(number + " ");
//        }
//        System.out.println();
//    }

    void printArray(int[] array) {
        for(int number = 0; number < array.length; number++) {
            System.out.print(array[number] + " ");
        }
        System.out.println();
    }
}
