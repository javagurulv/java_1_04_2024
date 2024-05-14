package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stock stock = new Stock();

        String stockName = stock.getStockName(scanner);
        int stockPriceCount = stock.getStockCount(scanner);
        double[] prices = stock.getPrices(scanner, stockPriceCount);
        stock.printMaxPrice(prices, stockName);
        stock.printMinPrice(prices, stockName);
        stock.printAveragePrice(prices, stockName);
    }


}
