package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_1.task_2;

class ColorDetector {

    String defineColor(int wavelength) {
        if ((wavelength >= 380) && (wavelength <= 449)) {
            return "Violet";
        } else if ((wavelength >= 450) && (wavelength <= 494)) {
            return "Blue";
        } else if ((wavelength >= 495) && (wavelength <= 569)) {
            return "Green";
        } else if ((wavelength >= 570) && (wavelength <= 589)) {
            return "Yellow";
        } else if ((wavelength >= 590) && (wavelength <= 619)) {
            return "Orange";
        } else if ((wavelength >= 620) && (wavelength <= 750)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }


}
