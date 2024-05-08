package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_5;

import java.util.Scanner;

class CommissionDemo {
    public static void main(String[] args) {
        Commission commission= new Commission();
        System.out.println("Commission 3% of 900: "+commission.calculateCommission(900));
        System.out.println("Commission 4% of 4000: "+commission.calculateCommission(4000));
        System.out.println("Commission 5% of 5200: "+commission.calculateCommission(5200));

    }
}
