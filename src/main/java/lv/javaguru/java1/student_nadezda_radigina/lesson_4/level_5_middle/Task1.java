package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_5_middle;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sum: ");
        double sum = scanner.nextDouble();

        if ((sum > 0) && (sum < 1000)){
            System.out.println("Fee is: " + (sum * 0.03));
        } else if ((sum >= 1000) && (sum < 5000)){
            System.out.println("Fee is: " + (sum * 0.04));
        } else if (sum > 5000){
            System.out.println("Fee is: " + (sum * 0.05));
        } else {
            System.out.println("Error");
        }



}
}
