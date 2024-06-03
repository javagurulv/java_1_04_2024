package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

import java.util.Scanner;

class InputNumber {

    Scanner scanner = new Scanner(System.in);

    // without parameter
    String textHint() {
        System.out.println("Please, enter the number: ");
        scanner.nextInt();
        return "Please, enter the number: ";
    }

    // with parameter (overloaded method)
    String textHint(String text){
        System.out.println(text);
        scanner.nextInt();
        return text;
    }

}
