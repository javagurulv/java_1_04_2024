package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_7.task_1;

class TemperatureConverter {
    double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
