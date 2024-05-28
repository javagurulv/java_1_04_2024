package lv.javaguru.java1.student_artem_galustan.lesson5.homework.Task_2;

class ColorDetection {

    String color(int number) {
        if (violet(number)) {
            return "Violet";
        } else if (blue(number)) {
            return "Blue";
        } else if (green(number)) {
            return "Green";
        } else if (yellow(number)) {
            return "Yellow";
        } else if (orange(number)) {
            return "Orange";
        } else if (red(number)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    boolean violet(int number) {
        return (number >= 380 &&  number<= 449);
        }

    boolean blue(int number) {
        return (number >= 450 &&  number<= 494);
    }

    boolean green(int number) {
        return (number >= 495 &&  number<= 569);
    }

    boolean yellow(int number) {
        return (number >= 570 &&  number<= 589);
    }

    boolean orange(int number) {
        return (number >= 590 &&  number<= 619);
    }

    boolean red(int number) {
        return (number >= 620 &&  number<= 750);
    }
}




