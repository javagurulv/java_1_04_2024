package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_3;

import java.util.ArrayList;


public class IntegerListDemo {
    public static void main(String[] args) {
        Integer int0 = 0;
        Integer int1 = 1;

        ArrayList<Integer> integerList = new ArrayList<>();

// Append to list, adds element as last item in the list

        integerList.add(int1);
        integerList.add(int1);
        integerList.add(int0);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }

}
