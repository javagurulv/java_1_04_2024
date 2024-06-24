package lv.javaguru.java1.student_pavels_zuriha.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        // Creating list of Integers

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(20);
        numbers.add(759);

        System.out.println(numbers);

        // Adding Integers at the Start/End of list

        numbers.add(0, 1);
        numbers.add(numbers.size(), 1000);

        System.out.println(numbers);

        // Showing size of List

        System.out.println("Size of List: " + numbers.size());

        // Delete element from List by index (example index = 4)

        numbers.remove(4);
        System.out.println(numbers);
        numbers.add(4, 759);

        // Delete element from List without index

        numbers.remove(Integer.valueOf(759));
        System.out.println(numbers);

        // Check if List is empty

        // numbers.clear();
        System.out.println(numbers);
        if (numbers.isEmpty()) {
            System.out.println ("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        // Display each element of the List

        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
