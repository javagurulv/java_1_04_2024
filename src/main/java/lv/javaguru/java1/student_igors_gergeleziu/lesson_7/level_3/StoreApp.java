package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_3;

import java.util.Scanner;

class StoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        System.out.println("How many receipts you want to add to array?");
        CashReceipt[] receiptArray = store.createReceiptArray(scanner.nextInt());
        store.fillArrayWithReceipts(receiptArray);
        store.printArray(receiptArray);
        System.out.println("Purchase amount of the day: " + store.calculatePurchaseAmount(receiptArray) + "$");
        System.out.println("Average purchase amount: " + store.calculateAveragePurchaseAmount(receiptArray) + "$");
    }
}
