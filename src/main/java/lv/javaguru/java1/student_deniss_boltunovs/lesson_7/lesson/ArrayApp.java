package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

import java.util.Arrays;

class ArrayApp {

    public static void main(String[] args) {

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
             marks[i] = i + 4;
        }

        System.out.println("Print marks array");
        System.out.println(Arrays.toString(marks));

        System.out.println(" ");
        int[] numbers = {1,2,3,4,5};
        System.out.println("Print numbers array");
        System.out.println(Arrays.toString(numbers));

        System.out.println(" ");
        System.out.println("Print numbers in one string");
        StringArray constructString = new StringArray();
        String stringResult = constructString.getNumbersAsString(0,10);
        System.out.println(stringResult );

    }

}
