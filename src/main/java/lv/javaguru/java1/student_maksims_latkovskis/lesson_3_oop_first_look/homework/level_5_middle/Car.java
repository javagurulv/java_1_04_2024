package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_5_middle;

class Car {

    private String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}
