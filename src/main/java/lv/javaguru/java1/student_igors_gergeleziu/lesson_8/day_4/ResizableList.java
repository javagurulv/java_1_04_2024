package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_4;

import java.util.ArrayList;
import java.util.List;

class ResizableList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(1);
        }
        if (list.size() == 1000000) {
            System.out.println("List contains 1 million objects");
        } else {
            System.out.println("Fail");
        }
    }
}
