package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_4;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CirclePerimeterAndArea {

    BigDecimal calculatePerimeter(BigDecimal radius) {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal perimeter = new BigDecimal("2").multiply(radius).multiply(pi);
        return perimeter.setScale(2, RoundingMode.HALF_UP);
    }

    BigDecimal calculateArea(BigDecimal radius) {
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal area = pi.multiply(radius).multiply(radius);
        return area.setScale(2, RoundingMode.HALF_UP);
    }
}
