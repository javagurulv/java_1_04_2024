package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_7_senior;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stock companyName = new Stock();
        companyName.setStockName();

        double[] prices = companyName.prices();

        companyName.maxPrice(companyName.getStockName(), prices);
        companyName.minPrice(companyName.getStockName(), prices);
        companyName.averagePrice(companyName.getStockName(), prices);

        System.out.println("Программа завершена.");
    }

}
