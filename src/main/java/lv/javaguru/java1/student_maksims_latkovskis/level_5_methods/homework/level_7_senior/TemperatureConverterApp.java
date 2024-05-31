package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

import java.util.Scanner;
class TemperatureConverterApp {

    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in the C24 format, where first letter stays for Celsius (or F for Fahrenheit)");

        String input = scanner.next();
        String scale = input.substring(0, 1);
        int temperature = Integer.parseInt(input.substring(1));

        if(scale.equals("F")){
             System.out.println("The temperature in Celsius is: " + temp.fahrenheitToCelsius(temperature));
        }
        else if(scale.equals("C")){
            System.out.println("The temperature in Fahrenheit is: " + temp.celsiusToFahrenheit(temperature) );
        }
        else{
            System.out.println("Error");
        }
    }
}
