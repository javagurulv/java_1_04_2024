package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_2_intern;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Shkoda", "red", 12.30);
        Car car2 = new Car("Ford", "green", 15.30);
        Car car3 = new Car("Fiat", "orange", 19.30);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        car1.setName("kdahfkjha");
        car1.setColor("akbkabsk");
        car1.setPrice(35.60);
        car2.setName("SLDNKHKDN");
        car2.setColor("JNDJKANSD");
        car2.setPrice(70.60);
        car3.setName("dkhHKHKdhjhd");
        car3.setColor("DKHKHjkjjkJNJKJ");
        car3.setPrice(90.60);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());




    }
}

