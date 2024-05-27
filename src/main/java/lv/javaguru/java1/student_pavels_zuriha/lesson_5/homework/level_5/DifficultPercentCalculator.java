package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_5;


class DifficultPercentCalculator {

    double difficultPercent(double startSum, double percent, int years) {
        return startSum * Math.pow(1 + percent, years);

    }

}




