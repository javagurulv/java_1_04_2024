package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_3;

import java.util.ArrayList;
import java.util.List;

class ListWithDuplicates {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        intList.add(34);
        intList.add(3);
        intList.add(4);
        intList.add(11);
        intList.add(5);
        intList.add(5);

        System.out.println("List size: " + intList.size());
        System.out.println("List elements: " + intList);
    }

}
