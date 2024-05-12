package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class Tax {

    String taxes(int a) {
        if ((a < 10000) && (a > 0)) {
            return "Tax = 30%";
        } else if ((a >= 10000) && (a <= 50000)) {
            return "Tax = 40%";
        } else if (a > 50000) {
            return "Tax = 50%";
        } else {
            return "Wrong number";
        }
    }
}


