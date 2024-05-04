package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_5;

class Car {

    private String newModel;

    Car(String newModel) {
        this.newModel = newModel;
    }

    String getModel() {
        return this.newModel;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}

