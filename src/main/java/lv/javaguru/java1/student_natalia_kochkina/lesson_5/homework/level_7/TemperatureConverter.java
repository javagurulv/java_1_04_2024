package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TemperatureConverter {

    /*
    (Фаренгейт — 32) : 1,8 = Цельсий
    Цельсий х 1,8 + 32 = Фаренгейт


    double calculateCelsius(double degrees) {
        return (degrees - 32) / 1.8;
    }

    double calculateFahrenheit(double degrees) {
        return (degrees * 1.8) + 32;
    }
    */

    BigDecimal calculateCelsius(BigDecimal degrees) {
        return (degrees.subtract(new BigDecimal("32")))
                .divide(new BigDecimal("1.8"), 2, RoundingMode.HALF_UP);
    }

    BigDecimal calculateFahrenheit(BigDecimal degrees) {
        return degrees.multiply(new BigDecimal("1.8"))
                .add(new BigDecimal("32"));
    }

}
