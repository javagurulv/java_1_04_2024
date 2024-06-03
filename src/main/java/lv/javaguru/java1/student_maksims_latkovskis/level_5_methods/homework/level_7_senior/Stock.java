package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

import java.util.Scanner;

class Stock {

    private String stockName;

    String setStockName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название акции: ");
        String stockName = scanner.nextLine();
        this.stockName = stockName;
        return stockName;
    }

    String getStockName(){
        return this.stockName;
    }
    double [] prices(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());
        double[] prices = new double[stockPriceCount];


        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    void maxPrice(String stockName, double[] prices){

        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);
    }

    void minPrice(String stockName, double[] prices){
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);
    }

    void averagePrice(String stockName, double[] prices){
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);
    }



}
