package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();


        integers.add(5); // adds element to the end
        integers.add(6);
        integers.add(2);
        integers.add(0, 4); // adds element to the beginning
        System.out.println(integers);

        //Prints size of the list
        System.out.println("Size is: " + integers.size());

        integers.remove(2); // removes third integer in a row (value 6)
        System.out.println(integers);

        integers.remove(Integer.valueOf(2)); // finds and removes value 2
        System.out.println(integers);

        System.out.println("List is empty: " + integers.isEmpty()); // Checks if the list is empty

        // Iterates through the list and prints each element
        for (Integer elements : integers) {
            System.out.println(elements);
        }
    }

}
