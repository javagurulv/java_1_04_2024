package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_2;

class CarApp {

    public static void main(String[] args) {

        Car bmw = new Car("bmw", "white",20000);
        Car audi = new Car("audi", "blue",35000);
        Car porsche = new Car("porsche", "yellow",135000);

        // BMW information
        System.out.println("Car model: " + bmw.getModel());
        System.out.println("Car color: " + bmw.getColor());
        System.out.println("Car price: " + bmw.getPrice());
        System.out.println(" ");

        // AUDI information
        System.out.println("Car model: " + audi.getModel());
        System.out.println("Car color: " + audi.getColor());
        System.out.println("Car price: " + audi.getPrice());
        System.out.println(" ");

        // PORSCHE information
        System.out.println("Car model: " + porsche.getModel());
        System.out.println("Car color: " + porsche.getColor());
        System.out.println("Car price: " + porsche.getPrice());
        porsche.setPrice(11000);
        System.out.println("Car new price: " + porsche.getPrice());

    }

}
