package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.homework.day_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class ListDemo {

    public  static  void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("Gala", 0.2));
        fruits.add(new Fruit("Braeburn", 0.1));
        fruits.add(new Fruit("Granny Smith", 0.15));

        Optional<Fruit> smallestFruit = fruits.stream()
                        .min(Comparator.comparingDouble(Fruit::getWeight));

        integers.add(4);
        integers.add(6);
        integers.add(1,0);

        System.out.println(integers);
        System.out.println("The smallest fruit is: " + smallestFruit.get().getFruit());
    }







}
