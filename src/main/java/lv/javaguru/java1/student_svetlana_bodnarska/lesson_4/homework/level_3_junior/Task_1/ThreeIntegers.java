package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_3_junior.Task_1;

import java.util.Scanner;

class ThreeIntegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter three integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if ((number1 >= number2) && (number1 >= number3)) {
            System.out.println(number1);
        } else if ((number2 >= number1) && (number2 >=number3))
            System.out.println(number2);
            else
                System.out.println(number3);



    }


}
