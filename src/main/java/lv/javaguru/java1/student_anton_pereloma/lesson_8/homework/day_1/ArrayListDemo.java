package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_1;
import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Boris","Ivanov",23);
        Person person2 = new Person("Doris","Johnson",33);
        Person person3 = new Person("Moris","Zarins",43);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println(person.firstName + " " + person.lastName + " " + person.age);
        }

    }
}
