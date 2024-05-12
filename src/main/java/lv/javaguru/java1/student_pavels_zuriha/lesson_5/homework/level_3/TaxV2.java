package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class TaxV2 {

    double taxCalc(int a) {
        if ((a < 10000) && (a > 0)) {
            return a * 0.3;
        } else if ((a >= 10000) && (a <= 50000)) {
            return a * 0.4;
        } else if (a > 50000) {
            return a * 0.5;
        } else {
            return a;
        }

    }
}



