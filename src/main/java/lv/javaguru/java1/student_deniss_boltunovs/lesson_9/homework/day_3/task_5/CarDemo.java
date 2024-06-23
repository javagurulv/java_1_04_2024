package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_3.task_5;

class CarDemo {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar(45);
        PetrolCar petrolCar = new PetrolCar(100.00);

        electricCar.accelerate();
        electricCar.accelerate();

        petrolCar.accelerate();
        petrolCar.accelerate();

    }
}
