package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_4;

import java.util.ArrayList;

public class PersonList {
    public static void main(String[] args) {
        int listLength = 1000000;
        Person person = new Person();
        ArrayList<Person> personList = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            personList.add(person);
        }
        System.out.println(personList.size());
    }
}
