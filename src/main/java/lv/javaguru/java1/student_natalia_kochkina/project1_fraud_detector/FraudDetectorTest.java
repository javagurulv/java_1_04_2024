package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.traderNameTest1();
        test.traderNameTest2();
        test.transactionAmountTest1();
        test.transactionAmountTest2();
        test.transactionAmountTest3();
        test.transactionCityTest1();
        test.transactionCityTest2();
    }

    //Trader's name = Pokemon -> false
    public void traderNameTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pokemon",
                "Tokio"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false, "traderNameTest1 ");
    }

    //Trader's name = Pikachu -> true
    public void traderNameTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true, "traderNameTest2 ");
    }

    //Transaction's amount = 1500000 -> false
    public void transactionAmountTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio"), 1500000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "transactionAmountTest1 ");
    }

    //Transaction's amount = 100000 -> true
    public void transactionAmountTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "transactionAmountTest2 ");
    }

    //Transaction's amount = 1000000 -> true
    public void transactionAmountTest3() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio"), 1000000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "transactionAmountTest3 ");
    }

    //Transaction's city = Sydney -> false
    public void transactionCityTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Sydney"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "transactionCityTest1 ");
    }

    //Transaction's city = Riga -> true
    public void transactionCityTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Riga"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "transactionCityTest2 ");
    }

    private void checkResults(boolean realResult, boolean expectedResult,
                              String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
