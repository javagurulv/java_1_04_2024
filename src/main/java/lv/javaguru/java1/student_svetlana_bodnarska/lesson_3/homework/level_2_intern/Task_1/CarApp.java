package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_2_intern.Task_1;

import java.nio.file.attribute.FileAttribute;

class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "red", 5000);
        Car car2 = new Car ("Porsche", "green", 100000);
        Car car3 = new Car ("Audi", "black", 65000);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Price " + car1.getPrice());

        System.out.println("Model: " + car2.getModel() + " Color: " + car2.getColor() + " Price: " + car2.getPrice());
        System.out.println("Model: " + car3.getModel() + " Color: " + car3.getColor() + " Price: " + car3.getPrice());


        car1.setModel("Fiat");
        car1.setColor("Rose");
        car1.setPrice(1000);
        System.out.println("Model: " +car1.getModel() + " Color: " + car1.getColor() + " Price: " + car1.getPrice());


        car2.setModel("Renault");
        car2.setColor("Blue");
        car2.setPrice(2000);
        System.out.println("Model: " + car2.getModel() + " Color: " + car2.getColor() + " Price: " + car2.getPrice());

        car3.setModel("Kia");
        car3.setColor("yellow");
        car3.setPrice(3000);
        System.out.println("Model: " + car3.getModel() + " Color: " + car3.getColor() + " Price: " + car3.getPrice());
















    }

}
