package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class Stock {

    public double[] stockPricesCount(int stockPriceCount) {

        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    public double stockMaxPrice(double[] prices) {

        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public double stockMinPrice(double[] prices) {

        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    public double stockAveragePrice(double[] prices) {

        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / prices.length;
    }
}
