package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class LaptopApplication {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asprie 5", 1005.25);
        Laptop laptop2 = new Laptop("Macbook", 2010.35);

        System.out.println("Laptop 1 model: " + laptop1.getModel());
        System.out.println("Laptop 1 price: " + laptop1.getPrice());

        System.out.println("Laptop 2 model: " + laptop2.getModel());
        System.out.println("Laptop 2 price: " + laptop2.getPrice());

    }
}
