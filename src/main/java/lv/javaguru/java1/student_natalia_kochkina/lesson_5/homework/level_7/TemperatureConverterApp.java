package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7;

import java.math.BigDecimal;

class TemperatureConverterApp {

    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        System.out.println(temperatureConverter.calculateCelsius(new BigDecimal("42")));
        System.out.println(temperatureConverter.calculateFahrenheit(new BigDecimal("20")));
    }
}
