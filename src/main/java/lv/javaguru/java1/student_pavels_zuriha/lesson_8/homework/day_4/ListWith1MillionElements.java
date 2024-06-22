package lv.javaguru.java1.student_pavels_zuriha.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class ListWith1MillionElements {

   List<Integer> createListWith1MillionElements() {

        List<Integer> numbers = new ArrayList<>();

        int listSize = 1;
        while (listSize <= 1000000) {
            numbers.add(listSize);
            listSize++;
        }
        return numbers;
    }

    List<Integer> createListWith1BillionElements() {

        List<Integer> numbers = new ArrayList<>();

        int listSize = 1;
        while (listSize <= 1000000000) {
            numbers.add(listSize);
            listSize++;
        }
        return numbers;
    }
}
