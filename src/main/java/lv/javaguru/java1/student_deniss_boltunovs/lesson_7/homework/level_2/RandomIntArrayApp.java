package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_2;

class RandomIntArrayApp {

    public static void main(String[] args) {
        RandomIntArray randomArray = new RandomIntArray();

        int[] array1 = randomArray.generateArray();
        System.out.println("Array 1:");
        randomArray.printArray(array1);

        int[] array2 = randomArray.generateArray();
        System.out.println("Array 2:");
        randomArray.printArray(array2);

        int[] array3 = randomArray.generateArray();
        System.out.println("Array 3:");
        randomArray.printArray(array3);
    }

}
