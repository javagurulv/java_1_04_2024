package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_4;

class StockApp {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }
}
