package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input stock name: ");
        String stockName = scanner.nextLine();

        int stockPriceCount = getStockPriceCount(scanner);
        double[] stockPrices = getStockPrices(stockPriceCount, scanner);

        calculateMaxPrice(stockPrices, stockName);
        calculateMinPrice(stockPrices, stockName);
        calculateAveragePrice(stockPrices,stockName);

        System.out.println("Program completed.");

    }

    private static int getStockPriceCount(Scanner scanner){
        System.out.print("Input count of stock prices: ");
        return Integer.parseInt(scanner.nextLine());
    }


    private static double[] getStockPrices(int stockPriceCount, Scanner scanner) {
        double[] prices = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Input stock price " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }


    private static void calculateMaxPrice(double[] prices, String stockName) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Max stock price " + stockName + ": " + maxPrice);
    }


    private static void calculateMinPrice(double[] prices, String stockName) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Min stock price " + stockName + ": " + minPrice);
    }


    private static void calculateAveragePrice(double[] prices, String stockName) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice += price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Stock average price " + stockName + ": " + averagePrice);
    }

}
