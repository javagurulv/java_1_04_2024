package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_3_junior;

import java.util.Scanner;

class ThreeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input three integers in the sequential matter:");
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int thirdInteger = scanner.nextInt();

        int largestNumber;

        if(firstInteger<secondInteger) {
           largestNumber = secondInteger;
        }
        else{
            largestNumber = firstInteger;
        }

        if(thirdInteger>largestNumber){
            largestNumber = thirdInteger;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
