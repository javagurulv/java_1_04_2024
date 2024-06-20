package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(0, 1);//add element to beginning of the list
        list.add(6);// add element to the end of the list
        System.out.println("Size of the list: " + list.size());

        Integer removeElement = 4;
        list.remove(2);//remove element by index
        list.remove(removeElement);// remove element by first occurrence
        System.out.println(list);

        System.out.println("Is List empty? " + list.isEmpty());
        System.out.print("List: ");

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
