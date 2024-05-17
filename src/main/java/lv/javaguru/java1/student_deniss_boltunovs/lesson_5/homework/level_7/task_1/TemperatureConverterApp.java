package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_7.task_1;

import java.util.Scanner;

class TemperatureConverterApp {

    public static void main(String[] args) {

        TemperatureConverter converter =  new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Celsius");
        int celsius1 = scanner.nextInt();
        System.out.println("Fahrenheit: " + converter.celsiusToFahrenheit(celsius1));

        System.out.println("Input Fahrenheit");
        int fahrenheit1 = scanner.nextInt();
        System.out.println("Celsius: " + converter.fahrenheitToCelsius(fahrenheit1));

        System.out.println("Input Celsius");
        int celsius2 = scanner.nextInt();
        System.out.println("Fahrenheit: " + converter.celsiusToFahrenheit(celsius2));

        System.out.println("Input Fahrenheit");
        int fahrenheit2 = scanner.nextInt();
        System.out.println("Celsius: " + converter.fahrenheitToCelsius(fahrenheit2));



    }
}
