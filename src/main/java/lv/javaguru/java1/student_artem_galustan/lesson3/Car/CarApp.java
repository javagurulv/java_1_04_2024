package lv.javaguru.java1.student_artem_galustan.lesson3.Car;

public class CarApp {
    public static void main(String[] args) {


        Cars NewCar = new Cars("MERCEDES", "Black", 3500);
        Cars NewCar2 = new Cars("BMW", "WHITE", 35000);
        Cars NewCar3 = new Cars("Subaru", "Black", 3600);


        System.out.println("Get method name is " + NewCar.getCarName());
        System.out.println("Get method name is " + NewCar2.getCarName());
        System.out.println("Get method name is " + NewCar3.getCarName());






    }
}