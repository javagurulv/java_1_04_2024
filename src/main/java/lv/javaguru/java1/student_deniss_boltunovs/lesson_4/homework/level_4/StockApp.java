package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_4;

public class StockApp {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("\nCompany = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(34);
        google.updatePrice(12);
        google.updatePrice(11);

        System.out.println("\nCompany = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

    }
}
