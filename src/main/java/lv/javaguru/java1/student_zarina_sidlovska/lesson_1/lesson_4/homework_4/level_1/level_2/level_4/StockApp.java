package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2.level_4;

class StockApp {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE",10);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(90);
        google.updatePrice(140);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }
}
