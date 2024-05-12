package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_4;

class StockApp {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 10);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.updatePrice(10);

        System.out.println("Company = " + google.getCompanyTitle());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

    }

}