package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_3;

import java.util.Scanner;

class Store {
    CashReceipt[] createReceiptArray(int sizeOfArray) {
        CashReceipt[] receiptArray = new CashReceipt[sizeOfArray];
        return receiptArray;
    }

    void fillArrayWithReceipts(CashReceipt[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter purchase amount of " + i + " receipt ID");
            int purchaseAmount = scanner.nextInt();
            array[i] = new CashReceipt(i, purchaseAmount);
        }
    }

    int calculatePurchaseAmount(CashReceipt[] array) {
        int purchaseAmount = 0;
        for (int i = 0; i < array.length; i++) {
            purchaseAmount += array[i].getPurchaseAmount();
        }
        return purchaseAmount;
    }

    double calculateAveragePurchaseAmount(CashReceipt[] array) {
        return calculatePurchaseAmount(array) / (double) array.length;
    }

    void printArray(CashReceipt[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
