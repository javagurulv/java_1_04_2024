package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_7_senior;

import java.util.Scanner;

class TemperatureConverterApplication {

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitFromCelsius = temperatureConverter.fromCelsiusToFahrenheit(celsius);
        System.out.println("Form C to F: " + fahrenheitFromCelsius);

        System.out.println("Enter fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusFromFahrenheit = temperatureConverter.fromFahrenheitToCelsius(fahrenheit);
        System.out.println("From F to C: " + celsiusFromFahrenheit);
    }

}
