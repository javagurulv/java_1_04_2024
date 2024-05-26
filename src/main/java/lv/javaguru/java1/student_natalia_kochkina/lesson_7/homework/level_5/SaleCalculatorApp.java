package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_5;

class SaleCalculatorApp {

    public static void main(String[] args) {
        Sale sale1 = new Sale("cucumber", 2, 5);
        Sale sale2 = new Sale("apple", 500, 7);
        Sale sale3 = new Sale("cucumber", 2, 5);
        Sale sale4 = new Sale("tomato", 10, 7);

        SaleCalculator calculator = new SaleCalculator();

        Sale[] sales = {sale1, sale2, sale3, sale4};
        Sale[] sales2 = {};

        System.out.println("Most selling product = "
                + calculator.findMostSelling(sales));
        System.out.println("Product with best turnover = "
                + calculator.findProductWithBestTurnover(sales));
    }
}
