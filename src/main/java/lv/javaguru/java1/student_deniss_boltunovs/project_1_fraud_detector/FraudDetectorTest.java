package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

import java.util.zip.DataFormatException;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.testIsNotFraud();
        test.testIsFraud();
    }

    // trader: The Best -> false
    public void testIsNotFraud(){
        Trader trader = new Trader("The Best", "London");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testIsNotFraud");
    }

    // trader: Pokemon -> true
    public void testIsFraud(){
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testIsFraud");
    }

    private void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult + ")");
        }
    }


}
