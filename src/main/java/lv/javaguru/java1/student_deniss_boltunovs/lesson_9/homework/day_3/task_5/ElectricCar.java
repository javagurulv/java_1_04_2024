package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_3.task_5;

class ElectricCar extends Car {

    private int batteryCharge;

    ElectricCar(int batteryCharge){
        this.batteryCharge = batteryCharge;
    }

    void accelerate(){
        int acceleration = 5;
        this.batteryCharge -= acceleration;
        System.out.println("Accelerated by " + acceleration + " , battery charge " + this.batteryCharge);
    }

}
