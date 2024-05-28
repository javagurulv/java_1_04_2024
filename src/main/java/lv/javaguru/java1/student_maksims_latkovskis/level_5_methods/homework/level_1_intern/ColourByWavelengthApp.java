package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_1_intern;

import java.util.Scanner;

class ColourByWavelengthApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ColourByWavelength colourWave = new ColourByWavelength();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the wavelength in nm:");
            int wavelength = scanner.nextInt();

            String wavelengthColour = colourWave.waveColour(wavelength);
            if (wavelengthColour == "Invisible light") {
                System.out.println("Invisible light");
            } else {
                System.out.println("The corresponding colour is: " + wavelengthColour);
            }
        }
    }
}
