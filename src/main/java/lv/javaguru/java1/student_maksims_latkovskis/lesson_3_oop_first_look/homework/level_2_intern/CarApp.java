package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_2_intern;

class CarApp {

    public static void main(String[] args){

        Car car1 = new Car("Volvo", "Blue", 18000);
        Car car2 = new Car("Audi", "Silver", 25000);
        Car car3 = new Car("Renault", "White", 12000);

        System.out.println("The make of the first car is: " + car1.getMake());
        System.out.println("The colour of the second car is: " + car2.getColour());
        System.out.println("The price of the third car is: " + car3.getPrice());

        car1.setMake("Skoda");
        car2.setColour("Green");
        car3.setPrice(11995);

        System.out.println("The new make of the first car is: " + car1.getMake());
        System.out.println("The new colour of the second car is: " + car2.getColour());
        System.out.println("The new price of the third car is: " + car3.getPrice());

    }


}
