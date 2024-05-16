package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_1_intern;

class ColorDetector {
    String waveLength(int wavelengthValue) {
        String color;
        if ((wavelengthValue > 380) && (wavelengthValue <= 449)) {
            color = "Violet";
        } else if ((wavelengthValue > 450) && (wavelengthValue <= 494)) {
            color = "Blue";
        } else if ((wavelengthValue > 495) && (wavelengthValue <= 569)) {
            color = "Green";
        } else if ((wavelengthValue > 570) && (wavelengthValue <= 589)) {
            color = "Yellow";
        } else if ((wavelengthValue > 590) && (wavelengthValue <= 619)) {
            color = "Orange";
        } else if ((wavelengthValue > 620) && (wavelengthValue <= 750)) {
            color = "Red";
        } else {
            color = "Invisible light";
        }
    return color;
    }
}





