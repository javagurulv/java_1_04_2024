package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_2;

class CarApp {
    public static void main(String[] args) {
        Car car1= new Car("Audi", "Yellow", 4000);
        Car car2= new Car("BMW", "White", 7000);
        Car car3= new Car("Mercedes", "Blue", 6000);
        System.out.println("Getters");
        System.out.println("Car1: "+car1.toString());
        System.out.println("Car2: "+car2.toString());
        System.out.println("Car3: "+car3.toString());
        System.out.println("Setters");
        car1.setBrand("Volkswagen");
        car2.setColor("Black");
        car3.setPrice(5000);
        System.out.println("Car1: "+car1.toString());
        System.out.println("Car2: "+car2.toString());
        System.out.println("Car3: "+car3.toString());
    }
}
