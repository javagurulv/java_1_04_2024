package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class ArrayGenerator {

    int[] createEmptyArray() {
        int[] arrayCell = new int[10];
        return arrayCell;
    }
    int[] createEmptyArray(int arrayLength) {
        int[] arrayCell = new int[arrayLength];
        return arrayCell;
    }

    int[] createArrayOfOnes(int arrayLength) {
        int[] arrayCell = new int[arrayLength];
        for(int i=0; i<arrayCell.length; i++) arrayCell[i]=1;
        return arrayCell;
    }


}
