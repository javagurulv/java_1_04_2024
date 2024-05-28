package lv.javaguru.java1.student_artem_galustan.lesson5.homework;



import java.util.Scanner;

 class DivideOn3And5App {
        public static void main(String[] args) {
            DivideOn3And5 division = new DivideOn3And5();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number: ");
            int number = scanner.nextInt();

            System.out.println(division.divisionOn3And5(number));

        }
    }

