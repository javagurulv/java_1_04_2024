package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_1_intern;

class ColorDetector {
    String detectColor(int number) {
        if ((number >= 380) && (number <= 449)) {
            return "Violet";
        }
        if ((number >= 450) && (number <= 494)) {
            return "Blue";
        }
        if ((number >= 495) && (number <= 569)) {
            return "Green";
        }
        if ((number >= 570) && (number <= 589)) {
            return "Yellow";
        }
        if ((number >= 590) && (number <= 619)) {
            return "Orange";
        }
        if ((number >= 620) && (number <= 750)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}