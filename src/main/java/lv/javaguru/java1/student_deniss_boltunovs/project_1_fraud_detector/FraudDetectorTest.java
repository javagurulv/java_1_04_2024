package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.testTraderIsNotPokemon();
        test.testTraderIsPokemon();
        test.testTransactionAmountBelowMillion();
        test.testTransactionAmountAboveMillion();
        test.testTraderCityNotSydney();
        test.testTraderCityIsSydney();
    }

    // trader: The Best -> false
    void testTraderIsNotPokemon(){
        Trader trader = new Trader("The Best", "London");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderIsNotPokemon");
    }

    // trader: Pokemon -> true
    void testTraderIsPokemon(){
        Trader trader = new Trader("Pokemon", "London");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderIsPokemon");
    }

    // amount: 25000 -> false
    void testTransactionAmountBelowMillion(){
        Trader trader = new Trader("The Best", "London");
        Transaction transaction = new Transaction(trader, 25000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTransactionAmountBelowMillion");
    }

    // amount: 1500000 -> true
    void testTransactionAmountAboveMillion(){
        Trader trader = new Trader("The Best", "London");
        Transaction transaction = new Transaction(trader, 1500000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTransactionAmountAboveMillion");
    }

    // city: Melbourne -> false
    void testTraderCityNotSydney(){
        Trader trader = new Trader("Michel Rose", "Melbourne");
        Transaction transaction = new Transaction(trader, 567000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderCityNotSydney");
    }

    // city: Sydney -> true
    void testTraderCityIsSydney(){
        Trader trader = new Trader("Michel Rose", "Sydney");
        Transaction transaction = new Transaction(trader, 567000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderCityIsSydney");
    }


    private void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult + ")");
        }
    }

}
