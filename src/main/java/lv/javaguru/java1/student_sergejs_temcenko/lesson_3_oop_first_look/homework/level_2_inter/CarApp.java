package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_2_inter;

public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "red", 1200);
        Car car2 = new Car("Ford", "green", 2000);
        Car car3 = new Car("Fiat", "blue", 3000);

        System.out.println("Car2 model: " + car2.getModel());
        System.out.println("Car1 model: " + car1.getColor());
        System.out.println("Car3 model: " + car3.getPrice());

        car1.setModel("Bobik");
        car2.setColor("gold");
        car3.setPrice(500);

        System.out.println("Car1 new name Bobik: " + car1.getModel());
        System.out.println("Car2 new color gold: " + car2.getColor());
        System.out.println("Car3 new prise 500: " + car3.getPrice());

    }

}
