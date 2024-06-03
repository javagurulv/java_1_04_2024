package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_7.task_1;

class TemperatureConverter {

    public double celsiusToFahrenheit(int celsius) {
        return (double) celsius * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(int fahrenheit) {
        return (double) (fahrenheit - 32) / 9 * 5;
    }

}
