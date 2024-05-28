package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3.new_version;

class ReceiptTest {

    public static void main(String[] args) {
        ReceiptTest test = new ReceiptTest();
        test.shouldReturnTotalSum();
        test.shouldReturnTotalSumZero();
        test.shouldReturnTotalAverage();
        test.shouldReturnTotalAverageZero();

    }


    public void shouldReturnTotalSum() {
        ReceiptCalculator receiptCalculator = new ReceiptCalculator();
        Receipt[] receipts = {
                new Receipt("Nr1", 30.52),
                new Receipt("Nr2", 60.24),
        };
        double realResult = receiptCalculator.receiptSumCalculator(receipts);
        checkResult(realResult,90.76, "shouldReturnTotalSum");
    }

    public void shouldReturnTotalSumZero() {
        ReceiptCalculator receiptCalculator = new ReceiptCalculator();
        Receipt[] receipts = {
        };
        double realResult = receiptCalculator.receiptSumCalculator(receipts);
        checkResult(realResult,0.0, "shouldReturnTotalSumZero");
    }

    public void shouldReturnTotalAverage() {
        ReceiptCalculator receiptCalculator = new ReceiptCalculator();
        Receipt[] receipts = {
                new Receipt("Nr1", 30.52),
                new Receipt("Nr2", 60.24),
        };
        double realResult = receiptCalculator.receiptAverageSumCalculator(receipts);
        checkResult(realResult,45.38, "shouldReturnTotalAverage");
    }

    public void shouldReturnTotalAverageZero() {
        ReceiptCalculator receiptCalculator = new ReceiptCalculator();
        Receipt[] receipts = {
        };
        double realResult = receiptCalculator.receiptAverageSumCalculator(receipts);
        checkResult(realResult,0.0, "shouldReturnTotalAverageZero");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
