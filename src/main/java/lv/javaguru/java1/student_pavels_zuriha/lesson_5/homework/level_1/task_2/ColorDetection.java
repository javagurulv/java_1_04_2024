package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_1.task_2;

import java.util.Scanner;

class ColorDetection {

    String color(int a) {
        if (violet(a)) {
            return "Violet";
        } else if (blue(a)) {
            return "Blue";
        } else if (green(a)) {
            return "Green";
        } else if (yellow(a)) {
            return "Yellow";
        } else if (orange(a)) {
            return "Orange";
        } else if (red(a)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    boolean violet(int a) {
        return (a >= 380 &&  a<= 449);
        }

    boolean blue(int a) {
        return (a >= 450 &&  a<= 494);
    }

    boolean green(int a) {
        return (a >= 495 &&  a<= 569);
    }

    boolean yellow(int a) {
        return (a >= 570 &&  a<= 589);
    }

    boolean orange(int a) {
        return (a >= 590 &&  a<= 619);
    }

    boolean red(int a) {
        return (a >= 620 &&  a<= 750);
    }
}




