package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_2;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Chery", "Red",12000);
        Car car2 = new Car("Geely", "White",14000);
        Car car3 = new Car("Dongfeng", "Orange",15000);

        System.out.println("Car: " + car1.getMake() + "\nColor: " + car1.getColor() + "\nPrice: " + car1.getPrice() + " Euro");
        System.out.println("Car: " + car2.getMake() + "\nColor: " + car2.getColor() + "\nPrice: " + car2.getPrice() + " Euro");
        System.out.println("Car: " + car3.getMake() + "\nColor: " + car3.getColor() + "\nPrice: " + car3.getPrice() + " Euro");


        car1.changeMake("XPeng");
        car1.changeColor("Yellow");
        car1.changePrice(17000);

        car2.changeMake("MG");
        car2.changeColor("Black");
        car2.changePrice(18000);

        car3.changeMake("Great Wall Motors");
        car3.changeColor("Blue");
        car3.changePrice(19000);

        System.out.println("Car: " + car1.getMake() + "\nColor: " + car1.getColor() + "\nPrice: " + car1.getPrice() + " Euro");
        System.out.println("Car: " + car2.getMake() + "\nColor: " + car2.getColor() + "\nPrice: " + car2.getPrice() + " Euro");
        System.out.println("Car: " + car3.getMake() + "\nColor: " + car3.getColor() + "\nPrice: " + car3.getPrice() + " Euro");
    }
}
