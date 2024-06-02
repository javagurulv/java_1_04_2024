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
        test.testTraderCountryIsJamaica();
        test.testTraderCountryNotJamaica();
        test.testTraderCountryGermanyAndAmountBelow1k();
        test.testTraderCountryGermanyAndAmountAbove1k();
    }

    // trader: The Best -> false
    void testTraderIsNotPokemon(){
        Trader trader = new Trader("The Best", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderIsNotPokemon");
    }

    // trader: Pokemon -> true
    void testTraderIsPokemon(){
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderIsPokemon");
    }

    // amount: 25000 -> false
    void testTransactionAmountBelowMillion(){
        Trader trader = new Trader("The Best", "London", "UK");
        Transaction transaction = new Transaction(trader, 25000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTransactionAmountBelowMillion");
    }

    // amount: 1500000 -> true
    void testTransactionAmountAboveMillion(){
        Trader trader = new Trader("The Best", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTransactionAmountAboveMillion");
    }

    // city: Melbourne -> false
    void testTraderCityNotSydney(){
        Trader trader = new Trader("Michel Rose", "Melbourne", "Australia");
        Transaction transaction = new Transaction(trader, 567000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderCityNotSydney");
    }

    // city: Sydney -> true
    void testTraderCityIsSydney(){
        Trader trader = new Trader("Michel Rose", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 567000);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderCityIsSydney");
    }

    // country: Jamaica -> true
    void testTraderCountryIsJamaica(){
        Trader trader = new Trader("Johny Tapia", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 5670);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderCountryIsJamaica");
    }

    // country: Canada -> false
    void testTraderCountryNotJamaica(){
        Trader trader = new Trader("Albert How", "Toronto", "Canada");
        Transaction transaction = new Transaction(trader, 5670);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderCountryNotJamaica");
    }

    // country: Germany, amount: 998 -> false
    void testTraderCountryGermanyAndAmountBelow1k(){
        Trader trader = new Trader("Albert How", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 998);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = false;
        checkResult(realResult, expectedResult, "testTraderCountryGermanyAndAmountBelow1k");
    }

    // country: Germany, amount: 1998 -> true
    void testTraderCountryGermanyAndAmountAbove1k(){
        Trader trader = new Trader("Albert How", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1998);
        FraudDetector detector = new FraudDetector();
        boolean realResult = detector.isFraud(transaction);
        boolean expectedResult = true;
        checkResult(realResult, expectedResult, "testTraderCountryGermanyAndAmountAbove1k");
    }


    private void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult + ")");
        }
    }

}
