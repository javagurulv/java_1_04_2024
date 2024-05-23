package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_7_senior;

class TempConverterDemo {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        System.out.println("26 Deg C = " + tempConverter.ConvertCelsiusToFahrenheit(26));
        System.out.println("26 Deg F = " + tempConverter.ConvertFahrenheitToCelsius(26));
    }
}
