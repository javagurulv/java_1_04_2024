package lv.javaguru.java1.student_pavels_zuriha.lesson_8.homework.day_4;

import java.util.List;

class ListWith1MillionElementsDemo {

    public static void main(String[] args) {

        ListWith1MillionElements listWith1MillionElements = new ListWith1MillionElements();
        List<Integer> listSize1Million = listWith1MillionElements.createListWith1MillionElements();

        System.out.println("List Size: " + listSize1Million.size());

        /* Does not work

        List<Integer> listSize1Billion = listWith1MillionElements.createListWith1BillionElements();
        System.out.println("List Size: " + listSize1Billion.size());

         */
    }
}
