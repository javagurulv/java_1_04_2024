package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_1;

class Wave {

    public String returnWaveColor(int number) {
        String color;

        if ((number >= 380) && (number <= 449)) {
            color = "Violet";
        } else if ((number >= 450) && (number <= 494)) {
            color = "Blue";
        } else if ((number >= 495) && (number <= 569)) {
            color = "Green";
        } else if ((number >= 570) && (number <= 589)) {
            color = "Yellow";
        } else if ((number >= 590) && (number <= 619)) {
            color = "Orange";
        } else if ((number >= 620) && (number <= 750)) {
            color = "Red";
        } else {
            color = "Invisible Light";
        }

        return color;
    }
}
