package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_1;

class TemperatureDemo {

    public static void main(String[] args) {

        Temperature temperature = new Temperature();

        System.out.println("98F will be in Celsius: " + temperature.celsiusCalc(98));
        System.out.println("27C will be in Fahrenheit: " + temperature.fahrenheitCalc(27));

    }

}
