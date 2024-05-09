package lv.javaguru.java1.student_jelena_k.lesson3;
import java.util.Scanner;


public class BookApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number >0;

        System.out.println("Number is negative = " + isNegative);
        System.out.println("Number is zero =" + isZero);
        System.out.println("Number is positive" + isPositive);

    }
}
