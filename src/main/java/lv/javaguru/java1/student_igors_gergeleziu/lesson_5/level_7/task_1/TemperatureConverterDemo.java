package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_7.task_1;

class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter= new TemperatureConverter();
        System.out.println("Celsius to Fahrenheit: ");
        System.out.println("Celsius 15 is "+temperatureConverter.convertToFahrenheit(15)+ " fahrenheit");
        System.out.println();
        System.out.println("Fahrenheit to Celsius: ");
        System.out.println("Fahrenheit 75 is "+temperatureConverter.convertToCelsius(75)+ " celsius");

    }
}
