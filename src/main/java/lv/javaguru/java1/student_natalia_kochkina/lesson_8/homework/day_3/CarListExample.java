package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_3;

import java.util.Arrays;
import java.util.List;

class CarListExample {

    Car car1 = new Car("BMW", "blue");
    Car car2 = new Car("BMW", "yellow");
    Car car3 = new Car("BMW", "red");
    Car car4 = new Car("BMW", "green");

    List<Car> cars = Arrays.asList(
            car1,
            car2,
            car1,
            car3,
            car4,
            car4
    );

    //да, список может хранить дубликаты

}
