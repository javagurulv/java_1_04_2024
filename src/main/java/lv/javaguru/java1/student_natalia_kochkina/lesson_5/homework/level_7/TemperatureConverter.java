package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7;

class TemperatureConverter {

    /*
    (Фаренгейт — 32) : 1,8 = Цельсий
    Цельсий х 1,8 + 32 = Фаренгейт
     */

    public double calculateCelsius(double degrees) {
        return (degrees - 32) / 1.8;
    }

    public double calculateFahrenheit(double degrees) {
        return (degrees * 1.8) + 32;
    }
}
