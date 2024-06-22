package lv.javaguru.java1.student_pavels_zuriha.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class ListDemo {

    private List<String> objectForLists;

    public ListDemo() {
        this.objectForLists = new ArrayList<>();
    }

    public List<String> getObjectForLists() {
        return objectForLists;
    }

    public void addCar(String objectForList) {
        this.objectForLists.add(objectForList);
    }


    public static void main(String[] args) {

        List<String> cars = new ArrayList<String>();
        cars.add("Car 1");
        cars.add("Car 2");
        System.out.println(cars);

        ListDemo listDemo = new ListDemo();
        listDemo.addCar("Car 1 For List");
        System.out.println(listDemo.getObjectForLists());


    }



}
