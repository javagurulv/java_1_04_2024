package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_1_intern;

class ColourByWavelength {

    public String waveColour(int wavelength) {
        if (wavelength < 379 || wavelength > 750) {
            return "Invisible light";
        } else {

            if (wavelength < 450) {
                return "Violet";
            } else if (wavelength < 495) {
                return "Blue";
            } else if (wavelength < 570) {
                return "Green";
            } else if (wavelength < 590) {
                return "Yellow";
            } else if (wavelength < 620) {
                return "Orange";
            } else if (wavelength <= 750) {
                return "Red";
            } else {
                return "Invisible light";
            }
        }
    }
}
