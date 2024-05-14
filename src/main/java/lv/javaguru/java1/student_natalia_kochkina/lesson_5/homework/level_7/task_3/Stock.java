package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class Stock {

    public String getStockName(Scanner scanner) {
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

    public int getStockCount(Scanner scanner) {
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public double[] getPrices(Scanner scanner, int stockPriceCount) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    public void printMaxPrice(double[] prices, String stockName) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);
    }

    public void printMinPrice(double[] prices, String stockName) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);
    }

    public void printAveragePrice(double[] prices, String stockName) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

}
