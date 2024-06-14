package lv.javaguru.java1.student_sergejs_temcenko.lesson_7_array_for.homework.level_3_junior;

class CashRegister {

    double calculateTotalSales(Receipt[] receipts){
        double totalScales = 0;
        for(Receipt receipt : receipts) {
            totalScales +=receipt.getReceiptNumber();
        }
        return totalScales;
    }

    double calculateAveragePurchase(Receipt[] receipts){
        if (receipts.length == 0) {
            return 0;
        }
        double totalScale = calculateTotalSales(receipts);
        return totalScale / receipts.length;
    }

    public static void main(String[] args) {
        Receipt[] receipts = {
                new Receipt(1, 200.0),
                new Receipt(2,300.0),
                new Receipt(3,400.0)
        };

        CashRegister register = new CashRegister();
        System.out.println("Sales " + register.calculateTotalSales(receipts));
        System.out.println("Average " + register.calculateAveragePurchase(receipts));

    }

}


