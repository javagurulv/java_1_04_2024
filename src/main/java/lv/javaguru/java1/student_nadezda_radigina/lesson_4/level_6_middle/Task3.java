package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_6_middle;

import java.util.Scanner;

class Task3 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        switch(number){
            case 1:
                System.out.println("Monady");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Mistake");
        }
    }
}
