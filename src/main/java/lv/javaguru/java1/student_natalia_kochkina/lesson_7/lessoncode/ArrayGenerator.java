package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class ArrayGenerator {

    int[] generateNumberArray() {
        int[] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = 0;
        }
        return numberArray;
    }

    int[] generateNumberArray(int number, int length) {
        int[] numberArray = new int[length];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = number;
        }
        return numberArray;
    }

}
