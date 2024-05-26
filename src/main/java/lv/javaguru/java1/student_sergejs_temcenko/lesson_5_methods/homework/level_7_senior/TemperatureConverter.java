package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_7_senior;

class TemperatureConverter {

    double fromCelsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    double fromFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

}
