package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.testNameCheckerShouldReturnFalse();
        test.testNameCheckerShouldReturnTrue();
        test.testTransactionBelow1000000();
        test.testTransactionAbove1000000();
        test.testCityCheckerSydney();
        test.testCityCheckerNotSydney();
        test.testCountryCheckerNotJamaica();
        test.testCountryCheckerJamaica();
        test.testCountryCheckerGermanyBelow1000();
        test.testCountryCheckerGermanyAbove1000();
    }

    public void testNameCheckerShouldReturnTrue() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 120);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, true, "testNameCheckerShouldReturnTrue");
    }

    public void testNameCheckerShouldReturnFalse() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 120);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, false, "testNameCheckerShouldReturnFalse");
    }

    public void testTransactionBelow1000000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, false, "testTransactionBelow1000000");
    }

    public void testTransactionAbove1000000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, true, "testTransactionAbove1000000");
    }

    public void testCityCheckerSydney() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, true, "testCityCheckerSydney");
    }

    public void testCityCheckerNotSydney() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, false, "testCityCheckerNotSydney");
    }

    public void testCountryCheckerNotJamaica() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, false, "testCountryCheckerNotJamaica");
    }

    public void testCountryCheckerJamaica() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100000);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, true, "testCountryCheckerJamaica");
    }

    public void testCountryCheckerGermanyBelow1000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 100);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        checkResult(realResult, false, "testCountryCheckerGermanyBelow1000");
    }

    public void testCountryCheckerGermanyAbove1000() {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Not Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);

        boolean realResult = fraudDetector.isFraud(transaction).isFraud();
        String scenarioName = fraudDetector.isFraud(transaction).getRuleName();
        checkResult(realResult, true, scenarioName);
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String scenarioName) {
        if (realResult == expectedResult) {
            System.out.println(scenarioName + ": OK");
        } else {
            System.out.println(scenarioName + ": FAIL. Real Result: " + realResult + ", Expected Result: " + expectedResult);
        }
    }

}


