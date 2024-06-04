package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

import java.util.Arrays;

class IntArrayExample {

    public static void main(String[] args) {

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
             marks[i] = i + 4;
        }

        System.out.println(" ");
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(marks));

        System.out.println("Print numbers in one string");
        StringArray myArray = new StringArray();
        System.out.println( myArray.getNumbersAsString(0,10));

    }

}
