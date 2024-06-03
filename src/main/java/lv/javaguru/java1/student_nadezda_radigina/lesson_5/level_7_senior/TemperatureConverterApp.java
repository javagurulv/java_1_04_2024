package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_7_senior;

 class TemperatureConverterApp {
     public static void main(String[] args){
         TemperatureConverter temperatureConverter = new TemperatureConverter();
         double celsiusTemperature = temperatureConverter.toCelsius(89);
         double celsiusTemperature1 = temperatureConverter.toCelsius(76);
         double celsiusTemperature2 = temperatureConverter.toCelsius(135);
         double celsiusTemperature3 = temperatureConverter.toCelsius(43);

         double fahrenheitTemperature = temperatureConverter.toFahrenheit(45);
         double fahrenheitTemperature1 = temperatureConverter.toFahrenheit(22);
         double fahrenheitTemperature2 = temperatureConverter.toFahrenheit(17);
         double fahrenheitTemperature3 = temperatureConverter.toFahrenheit(36);


         System.out.println("Celsius temperature is " + celsiusTemperature);
         System.out.println("Celsius temperature is " + celsiusTemperature1);
         System.out.println("Celsius temperature is " + celsiusTemperature2);
         System.out.println("Celsius temperature is " + celsiusTemperature3);
         System.out.println();
         System.out.println("Fahrenheit temperature is " + fahrenheitTemperature);
         System.out.println("Fahrenheit temperature is " + fahrenheitTemperature1);
         System.out.println("Fahrenheit temperature is " + fahrenheitTemperature2);
         System.out.println("Fahrenheit temperature is " + fahrenheitTemperature3);



     }
}
