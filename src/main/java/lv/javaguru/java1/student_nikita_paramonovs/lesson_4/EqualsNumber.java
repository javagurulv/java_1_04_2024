package lv.javaguru.java1.student_nikita_paramonovs.lesson_4;

import java.util.Scanner;

public class EqualsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int Number = scanner.nextInt();
        System.out.println("Enter number: ");
        int Number2 = scanner.nextInt();

        if(Number != Number2){
            System.out.println("Number Are Not Equal " + Number );


        }else {
            System.out.println("Number Are Equal");
        }
    }

        }



