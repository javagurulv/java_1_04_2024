package lv.javaguru.java1.student_nadezda_radigina.lesson2.level3;

import java.util.Scanner;

class PerimeterArea {
      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Radius = ");
         double radius = scanner.nextDouble();
         System.out.println("Perimeter is ="+ 2 * Math.PI * radius);
         System.out.println("Area is ="+ Math.PI * Math.pow(radius, 2));


     }

}
