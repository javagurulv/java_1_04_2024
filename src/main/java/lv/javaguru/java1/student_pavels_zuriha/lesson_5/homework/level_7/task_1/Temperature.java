package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_1;

class Temperature {

    double celsiusCalc (int fahrenheit) {
        return (double) ((fahrenheit - 32) * 5) / 9;

    }

    double fahrenheitCalc (int celsius) {
        return (double) ((celsius * 9) / 5) + 32;

    }
}


