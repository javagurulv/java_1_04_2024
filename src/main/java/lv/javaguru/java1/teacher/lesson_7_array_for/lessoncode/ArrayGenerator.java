package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class ArrayGenerator {

    // create array
    // fill array with zeros

    // createAndFillWithZeros
    // createEmptyArray

    int[] generateArray() {
        int[] tenElements = new int[10];
        for (int i = 0; i < tenElements.length; i++) {
            tenElements[i] = 0;
        }
        return tenElements;
    }

    int[] generateArray(int arrayLength) {
        int[] arrayOfInts = new int[arrayLength];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = 0;
        }
        return arrayOfInts;
    }


}
