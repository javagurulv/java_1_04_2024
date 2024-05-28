package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3.old_version;

import java.util.Scanner;

class ReceiptApp {

    public static void main(String[] args) {

        ReceiptCalc receiptCalc = new ReceiptCalc();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of receipts: ");
        int receiptCount = scanner.nextInt();

        //double[] receiptArray = new double[receiptCount ];
        Receipt[] receiptArray = new Receipt[receiptCount ];

        for (int i = 0; i < receiptArray.length; i++) {
            System.out.println("Enter total sum of receipt Nr" + (i+1));
            //receiptArray[i] = scanner.nextDouble();
            double sum = scanner.nextDouble();
            receiptArray[i] = new Receipt(i, sum);
        }

        System.out.println("Total sum of receipts: " + receiptCalc.receiptSumAll(receiptArray,receiptCount));
        System.out.println("Average of receipts: " + receiptCalc.receiptAverageAll(receiptArray,receiptCount));

    }
}
