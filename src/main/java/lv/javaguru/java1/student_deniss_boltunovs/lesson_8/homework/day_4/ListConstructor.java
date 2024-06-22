package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class ListConstructor {

    List<Integer> constructDynamicList(int numOfElements) {
        List<Integer> list = new ArrayList<>();
        int millionCounter = 1;
        while (millionCounter <= numOfElements) {
            list.add(millionCounter);
            millionCounter++;
        }
        return list;
    }

}
