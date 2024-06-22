package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_4;

import java.util.List;

class ListApp {

    public static void main(String[] args) {

        ListConstructor constructor = new ListConstructor();

        //// works as expected
        List<Integer> millionElementsList = constructor.constructDynamicList(1000000);
        System.out.println("List size: " + millionElementsList.size());

        //// not working
//        List<Integer> billionElementsList = constructor.constructDynamicList(100000000);
//        System.out.println("List size: " + billionElementsList.size());

    }
}
