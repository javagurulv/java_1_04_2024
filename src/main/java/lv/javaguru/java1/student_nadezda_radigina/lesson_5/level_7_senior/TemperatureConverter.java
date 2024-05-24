package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_7_senior;

 class TemperatureConverter {

     public double toCelsius(double fahrenheit){
         double celsius;
         celsius = (fahrenheit - 32.0) * 5 / 9;
         return celsius;
     }
     public double toFahrenheit(double celsius){
         double fahrenheit;
         fahrenheit = (celsius * 9 / 5) + 32;
         return fahrenheit;
     }
}
