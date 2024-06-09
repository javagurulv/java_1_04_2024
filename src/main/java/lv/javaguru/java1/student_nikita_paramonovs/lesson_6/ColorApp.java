package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

import java.util.Scanner;

 class ColorApp {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the wavelength (in nm):");
         int wavelength = scanner.nextInt();

         String color = Color.getColor(wavelength);
         System.out.println("The color is: " + color);


         int[] testWavelengths = {400, 470, 520, 580, 600, 700, 800};
         for (int testWavelength : testWavelengths) {
             System.out.println("Wavelength: " + testWavelength + " nm -> Color: " + Color.getColor(testWavelength));
         }
     }
}
