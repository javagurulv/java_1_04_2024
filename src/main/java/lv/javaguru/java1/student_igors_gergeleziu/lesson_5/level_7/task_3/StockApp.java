package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_7.task_3;

import java.util.Scanner;

class StockApp {
    public static void main(String[] args) {
        StockApp app = new StockApp();
        Scanner scanner = new Scanner(System.in);
        String stockName = app.getStockName(scanner);
        int stockPriceCount = app.getStockPriceCount(scanner);
        double[] prices = app.getStockPrices(scanner, stockPriceCount);
        double maxPrice = app.findMaxPrice(prices);
        System.out.println("Max stock price " + stockName + ": " + maxPrice);
        double minPrice = app.findMinPrice(prices);
        System.out.println("Min stock price " + stockName + ": " + minPrice);
        double averagePrice = app.calculateAveragePrice(prices);
        System.out.println("Average stock price " + stockName + ": " + averagePrice);
        System.out.println("The program is completed.");
    }

    private String getStockName(Scanner scanner) {
        System.out.print("Enter stock name: ");
        return scanner.nextLine();
    }

    private int getStockPriceCount(Scanner scanner) {
        System.out.print("Enter stock price count: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private double[] getStockPrices(Scanner scanner, int stockPriceCount) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Enter stock price " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    private double findMinPrice(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    private double findMaxPrice(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    private double calculateAveragePrice(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / prices.length;
    }
}
