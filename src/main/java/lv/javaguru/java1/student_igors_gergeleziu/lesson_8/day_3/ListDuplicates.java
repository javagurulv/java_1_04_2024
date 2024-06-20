package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_3;

import java.util.ArrayList;
import java.util.List;

class ListDuplicates {
    public static void main(String[] args) {
        List<Integer> duplicates= new ArrayList<>();
        duplicates.add(2);
        duplicates.add(2);
        duplicates.add(2);
        duplicates.add(2);
        System.out.println(duplicates);

        List<String> duplicates2= new ArrayList<>();
        String name="Name";
        String name2=name;
        String name3=name2;
        duplicates2.add(name);
        duplicates2.add(name2);
        duplicates2.add(name3);
        System.out.println(duplicates2);
    }
}
