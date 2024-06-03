package lv.javaguru.java1.student_natalia_kochkina.lesson_4.lessoncode;

import java.util.Scanner;

class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchase price");
        int price = scanner.nextInt();
        double finalPrice;

        if ((price > 5000) && (price <= 10000)) {
            finalPrice = price * 0.9;
        } else if(price <= 5000) {
            finalPrice = price;
        } else {
            finalPrice = price * 0.8;
        }

        System.out.println("Price with discount = " + finalPrice);
    }
}
