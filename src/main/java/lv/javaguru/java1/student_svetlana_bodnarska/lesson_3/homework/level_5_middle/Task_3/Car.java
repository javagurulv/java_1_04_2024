package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_5_middle.Task_3;

class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel(){
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

