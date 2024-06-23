package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_3.task_5;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    PetrolCar(double petrolTankCapacity){
        this.petrolTankCapacity = petrolTankCapacity;
    }

    void accelerate(){
        double acceleration = 7.5;
        this.petrolTankCapacity -= acceleration;
        System.out.println("Accelerated by " + acceleration + ", petrol tank capacity " + this.petrolTankCapacity);
    }

}
