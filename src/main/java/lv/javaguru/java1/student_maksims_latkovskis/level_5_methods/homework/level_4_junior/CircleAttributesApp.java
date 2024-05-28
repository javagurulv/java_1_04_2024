package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_4_junior;

import java.util.Scanner;
class CircleAttributesApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CircleAttributes circle = new CircleAttributes();

        double[] radiusCircle = {4, 6, 15};
        for(double radius: radiusCircle) {
            System.out.print("For the Circle of radius " + radius);
            System.out.print(" the perimeter is: " + circle.perimeter(radius));
            System.out.println(", the area is: " + circle.area(radius));
        }
    }

}
