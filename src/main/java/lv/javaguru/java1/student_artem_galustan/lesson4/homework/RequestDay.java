package lv.javaguru.java1.student_artem_galustan.lesson4.homework;

import java.util.Scanner;

public class RequestDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter number from 1 to 7");

        int Daynumber = scanner.nextInt();
        if(Daynumber == 1 ) {
            System.out.println("Monday");

        }
else if (Daynumber == 2 ){
            System.out.println("Tuesday");

        }
        else if (Daynumber == 3 ){
            System.out.println("Wensday");

        }else if (Daynumber == 4 ){
            System.out.println("Thursday");

        }else if (Daynumber == 5 ){
            System.out.println("Friday");

        }else if (Daynumber == 6 ){
            System.out.println("Saturday");

        }else if (Daynumber == 7 ){
            System.out.println("Sunday");

        }else {             System.out.println("Error!");

        }
    }
}
