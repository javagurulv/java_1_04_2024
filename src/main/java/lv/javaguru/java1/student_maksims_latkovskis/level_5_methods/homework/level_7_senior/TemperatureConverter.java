package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

class TemperatureConverter {

    public double celsiusToFahrenheit(double tempCelsius){
        return tempCelsius * 9/5 + 32;
    }

    public double fahrenheitToCelsius(double tempFahrenheit){
        return (tempFahrenheit - 32) * 5/9;
    }
}
