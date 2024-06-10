package lv.javaguru.java1.student_sergejs_temcenko.lesson_7_array_for.homework.level_2_inter.task_7;



class RandomIntArrayApp {

    public static void main(String[] args) {

        RandomIntArray randomIntArray = new RandomIntArray();
        int[] myArray1 = randomIntArray.generateRandomArray();
        int[] myArray2 = randomIntArray.generateRandomArray();
        int[] myArray3 = randomIntArray.generateRandomArray();

        randomIntArray.printArray(myArray1);
        randomIntArray.printArray(myArray2);
        randomIntArray.printArray(myArray3);
    }
}


