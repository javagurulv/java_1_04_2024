package lv.javaguru.java1.student_artem_galustan.lesson7.homework.Level3;

public class CashReceptCalculationTest {

        public static void main(String[] args) {
            CashReceptCalculationTest test = new CashReceptCalculationTest();
            test.returnTotalSum();
            test.returnTotalSumZero();
            test.returnAverage();
            test.returnTotalAverageZero();
        }

        public void returnTotalSum() {
            CashReceiptCalculation receiptCalculation = new CashReceiptCalculation();
            CashRecept[] recepts = {
                    new CashRecept("No1", 50.00),
                    new CashRecept("No2", 50.00),
            };
            double realResult = receiptCalculation.receptCalculate(recepts);
            checkResult(realResult, 100.00, "No1");
        }

        public void returnTotalSumZero() {
            CashReceiptCalculation receiptCalculation = new CashReceiptCalculation();
            CashRecept[] recepts = {};
            double realResult = receiptCalculation.receptCalculate(recepts);
            checkResult(realResult, 0.0, "Plz return 0");
        }

        public void returnAverage() {
            CashReceiptCalculation receiptCalculation = new CashReceiptCalculation();
            CashRecept[] recepts = {
                    new CashRecept("No1", 50.30),
                    new CashRecept("No2", 70.00),
            };
            double realResult = receiptCalculation.receptCalculate(recepts);
            checkResult(realResult, 60.15, "Average");
        }

        public void returnTotalAverageZero() {
            CashReceiptCalculation receiptCalculation = new CashReceiptCalculation();
            CashRecept[] recepts = {};
            double realResult = receiptCalculation.receptCalculate(recepts);
            checkResult(realResult, 0.0, "Total Average Zero");
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