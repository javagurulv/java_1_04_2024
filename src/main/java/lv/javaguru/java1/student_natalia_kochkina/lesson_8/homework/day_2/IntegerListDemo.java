package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>(Arrays
                .asList(2, 3, 4, 5));

        //  - добавить в список элемент (в начало и в конец)
        listOfNumbers.add(0, 1);
        listOfNumbers.add(0, 0);
        listOfNumbers.add(6);
        listOfNumbers.add(7);

        //  - узнать длину списка
        System.out.println(listOfNumbers.size());

        //  - удалить элемент из списка (по индексу и без)
        listOfNumbers.remove(5);
        listOfNumbers.removeIf(number -> number == 0);

        //  - узнать пустой список или нет
        System.out.println(listOfNumbers.isEmpty());

        //  - обойти список и вывести на консоль каждый элемент.
        System.out.println(listOfNumbers);

        for (Integer number : listOfNumbers) {
            System.out.println(number);
        }
    }

}
