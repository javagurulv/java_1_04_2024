package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_2;

class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "black", 4000);
        Car car2 = new Car("Alfa Romeo", "red", 6000);
        Car car3 = new Car("Kamaz", "green", 20000);

        System.out.println("car1 brand = " + car1.getBrand());
        System.out.println("car1 color = " + car1.getColor());
        System.out.println("car1 price = " + car1.getPrice());
        System.out.println("car2 brand = " + car2.getBrand());
        System.out.println("car2 color = " + car2.getColor());
        System.out.println("car2 price = " + car2.getPrice());
        System.out.println("car3 brand = " + car3.getBrand());
        System.out.println("car3 color = " + car3.getColor());
        System.out.println("car3 price = " + car3.getPrice());

        car1.setBrand("Volvo");
        System.out.println("car1 new brand = " + car1.getBrand());
        car2.setColor("blue");
        System.out.println("car2 new color = " + car2.getColor());
        car3.setPrice(30000);
        System.out.println("car3 new price = " + car3.getPrice());

    }

}
