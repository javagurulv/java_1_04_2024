package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stockName = getStockName(scanner);
        int stockPriceCount = getStockCount(scanner);
        double[] prices = getPrices(scanner, stockPriceCount);
        printMaxPrice(prices, stockName);
        printMinPrice(prices, stockName);
        printAveragePrice(prices, stockName);
    }

    private static String getStockName(Scanner scanner) {
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

    private static int getStockCount(Scanner scanner) {
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static double[] getPrices(Scanner scanner, int stockPriceCount) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    private static void printMaxPrice(double[] prices, String stockName) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);
    }

    private static void printMinPrice(double[] prices, String stockName) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);
    }

    private static void printAveragePrice(double[] prices, String stockName) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

}
