package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_7.task_3;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stock stock = new Stock();

        System.out.print("Введите название акции: ");
        String stockName = scanner.nextLine();

        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());

        double[] prices = stock.stockPricesCount(stockPriceCount);

        double maxPrice = stock.stockMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = stock.stockMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);


        double averagePrice = stock.stockAveragePrice(prices);
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

}
