package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_5;

class Car {

    private String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
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
