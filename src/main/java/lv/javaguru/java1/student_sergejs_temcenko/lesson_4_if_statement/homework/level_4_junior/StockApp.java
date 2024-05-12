package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_4_junior;

class StockApp {
    public static void main(String[] args) {

        Stock googleStock = new Stock("Google", 150);

        googleStock.updatePrise(250);
        googleStock.updatePrise(210);
        googleStock.updatePrise(130);
        googleStock.updatePrise(235);

        System.out.println("Company = " + googleStock.getCompanyName());
        System.out.println("Current Price = " + googleStock.getCurrentPrice());
        System.out.println("Min Price = " + googleStock.getMinPrise());
        System.out.println("Max Price = " + googleStock.getMaxPrise());
    }
}
