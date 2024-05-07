package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

import java.util.Scanner;

class CarApp {
    public static void main(String[] args) {


    Car car1 = new Car("BMW", "Black", 3.556);
    Car car2 = new Car("Mersedes", "Yellow", 2.754);
    Car car3 = new Car("Audi", "Blue", 3.296);

        System.out.println("car1 Brand " +car1.getBrand());
        System.out.println("car2 Brand " +car2.getBrand());
        System.out.println("car3 Brand " +car3.getBrand());

        System.out.println("car1 Color "+car1.getColor());
        System.out.println("car2 Color "+car2.getColor());
        System.out.println("car3 Color "+car3.getColor());

        System.out.println("car1 Price $"+car1.getPrice());
        System.out.println("car2 Price $"+car2.getPrice());
        System.out.println("car3 Price $"+car3.getPrice());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a new brand for car1: ");
        String newBrand1 = scanner.nextLine();
        car1.setBrand(newBrand1);

        System.out.print("Enter a new brand for car2: ");
        String newBrand2 = scanner.nextLine();
        car2.setBrand(newBrand2);

        System.out.print("Enter a new brand for car3: ");
        String newBrand3 = scanner.nextLine();
        car2.setBrand(newBrand3);


        System.out.println("New Brands:");
        System.out.println("Car1 brand is: " + car1.getBrand());
        System.out.println("Car2 brand is: " + car2.getBrand());
        System.out.println("Car3 band is: " + car3.getBrand());

        System.out.print("Enter a new color for car1: ");
        String newColor1 = scanner.nextLine();
        car1.setBrand(newColor1);

        System.out.print("Enter a new color for car2: ");
        String newColor2 = scanner.nextLine();
        car2.setBrand(newColor2);

        System.out.print("Enter a new color for car3: ");
        String newColor3 = scanner.nextLine();
        car2.setBrand(newColor3);

        System.out.println("New Color:");
        System.out.println("Car1 color is: " + car1.getColor());
        System.out.println("Car2 color is: " + car2.getColor());
        System.out.println("Car3 color is: " + car3.getColor());





}



}
