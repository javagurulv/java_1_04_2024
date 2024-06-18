package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ListGenerator {

    List<Integer> generateMillionElementsList(Integer number,
                                                      int listSize) {
        return Stream.generate(() -> number)
                .limit(listSize)
                .collect(Collectors.toList());
    }

}
