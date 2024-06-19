package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_1;

import java.util.List;

class ListExample {

    //хранит только ссылки на объекты

    List<Integer> listOfNumbers = List.of(2, 3, 4, 5);

    List<Frog> listOfFrogs = List.of(
            new Frog("Frog1", "green"),
            new Frog("Frog2", "green"),
            new Frog("Frog3", "green"),
            new Frog("Frog4", "green")
    );

}
