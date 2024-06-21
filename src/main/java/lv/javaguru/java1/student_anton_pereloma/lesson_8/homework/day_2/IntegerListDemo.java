package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_2;

import java.util.ArrayList;


public class IntegerListDemo {
    public static void main(String[] args) {
        Integer int0 = 0;
        Integer int1 = 1;
        Integer int2 = 2;
        Integer int3 = 3;

        ArrayList<Integer> integerList = new ArrayList<>();
// Append to list, adds element as last item in the list
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
// Adds to list as the first item in the list
        integerList.add(0,int0);

// List length
        System.out.println(integerList.size());
// Find if the list is empty or not, returns boolean
        System.out.println(integerList.isEmpty());

        for (Integer integer : integerList) {
            System.out.println(integer);
        }



    }

}
