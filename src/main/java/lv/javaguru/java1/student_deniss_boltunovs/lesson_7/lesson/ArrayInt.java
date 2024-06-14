package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class ArrayInt {

    int[] generateArray(int arrayLength){
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }

}
