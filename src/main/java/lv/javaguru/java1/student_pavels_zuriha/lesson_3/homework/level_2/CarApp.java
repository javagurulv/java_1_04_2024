package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_2;

class CarApp {

    public static void main(String[] args){
        Car car1= new Car("Brand1", "Blue", 1000);
        Car car2= new Car("Brand2", "Green", 2000);
        Car car3= new Car("Brand3", "Yellow", 3000);

        System.out.println("Car1 Brand, Color, Price: " + car1.getCarBrand() + ", " + car1.getCarColor() + ", " + car1.getCarPrice());
        System.out.println("Car2 Brand, Color, Price: " + car2.getCarBrand() + ", " + car2.getCarColor() + ", " + car2.getCarPrice());
        System.out.println("Car2 Brand, Color, Price: " + car3.getCarBrand() + ", " + car3.getCarColor() + ", " + car3.getCarPrice());

        car1.setCarBrand("NewBrand1");
        car2.setCarBrand("NewBrand2");
        car3.setCarBrand("NewBrand3");

        car1.setCarColor("Light Blue");
        car2.setCarColor("Light Green");
        car3.setCarColor("Light Yellow");

        car1.setCarPrice(10000);
        car2.setCarPrice(20000);
        car3.setCarPrice(30000);

        System.out.println("New Car1 Brand, Color, Price: " + car1.getCarBrand() + ", " + car1.getCarColor() + ", " + car1.getCarPrice());
        System.out.println("New Car2 Brand, Color, Price: " + car2.getCarBrand() + ", " + car2.getCarColor() + ", " + car2.getCarPrice());
        System.out.println("New Car3 Brand, Color, Price: " + car3.getCarBrand() + ", " + car3.getCarColor() + ", " + car3.getCarPrice());

    }
}
