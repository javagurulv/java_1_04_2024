package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7;

import java.util.Scanner;

class Temperature {

    double celsiusCalc (int fahrenheit) {
        return (double) ((fahrenheit - 32) * 5) / 9;

    }

    double fahrenheitCalc (int celsius) {
        return (double) ((celsius * 9) / 5) + 32;

    }
}

class TemperatureDemo {

    public static void main(String[] args) {

        Temperature temperature = new Temperature();

        System.out.println("98F will be in Celsius: " + temperature.celsiusCalc(98));
        System.out.println("27C will be in Fahrenheit: " + temperature.fahrenheitCalc(27));

    }

}
