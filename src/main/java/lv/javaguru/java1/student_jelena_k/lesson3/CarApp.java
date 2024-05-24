package lv.javaguru.java1.student_jelena_k.lesson3;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "red");
        Car car2 = new Car("Audi" , "black");

        System.out.println("car1 model = " + car1.getModel());
        System.out.println("car1 color = " + car1.getColor());
        System.out.println("car2 model = " + car2.getModel());
        System.out.println("car2 color = " + car2.getColor());

        car1.setModel("Opel");
        System.out.println("car1 new model = " + car1.getModel());
        car2.setColor("green");
        System.out.println("car2 new color = " + car2.getColor());
    }
}
