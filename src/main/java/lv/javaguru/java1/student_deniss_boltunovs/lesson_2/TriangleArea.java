package lv.javaguru.java1.student_deniss_boltunovs.lesson_2;

// alt + enter short key to import package
import java.util.Scanner ;

public class TriangleArea {
    public static void main(String[] args) {
        // creating object scanner for input from console
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter triangle a: ") ;
        int a = scanner.nextInt();

        System.out.println("Enter triangle b: ") ;
        int b = scanner.nextInt();

        System.out.println("Enter triangle c: ") ;
        int c = scanner.nextInt() ;

        double p = (double) (a + b + c) /  2 ;
        double s = Math.sqrt( p * (p - a) * (p - b) * (p - c)) ;

        System.out.println(s) ;

    }
}
