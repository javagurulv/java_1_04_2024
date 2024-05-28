package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.traderNameTest1();
        test.traderNameTest2();
        test.transactionAmountTest1();
        test.transactionAmountTest2();
        test.transactionAmountTest3();
        test.traderCityTest1();
        test.traderCityTest2();
        test.traderCountryTest1();
        test.traderCountryTest2();
        test.traderFromGermanyTest1();
        test.traderFromGermanyTest2();
    }

    //Trader's name = Pokemon -> true
    public void traderNameTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pokemon",
                "Tokio", "Japan"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true, "traderNameTest1 ");
    }

    //Trader's name = Pikachu -> false
    public void traderNameTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 10000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false, "traderNameTest2 ");
    }

    //Transaction's amount = 1500000 -> true
    public void transactionAmountTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 1500000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "transactionAmountTest1 ");
    }

    //Transaction's amount = 100000 -> false
    public void transactionAmountTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "transactionAmountTest2 ");
    }

    //Transaction's amount = 1000000 -> false
    public void transactionAmountTest3() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Tokio", "Japan"), 1000000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "transactionAmountTest3 ");
    }

    //Trader's city = Sydney -> true
    public void traderCityTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Sydney", "Australia"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "transactionCityTest1 ");
    }

    //Trader's city = Riga -> false
    public void traderCityTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Riga", "Latvia"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "transactionCityTest2 ");
    }

    //Trader's country = Jamaica -> true
    public void traderCountryTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Kingston", "Jamaica"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "traderCountryTest1 ");
    }

    //Trader's country = USA -> false
    public void traderCountryTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "New York", "USA"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "traderCountryTest2 ");
    }

    //Country = Germany, amount = 100000 -> true
    public void traderFromGermanyTest1() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Berlin", "Germany"), 100000);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, true,
                "traderFromGermanyTest1 ");
    }

    //Country = Germany, amount = 600 -> false
    public void traderFromGermanyTest2() {
        FraudDetector detector = new FraudDetector();
        Transaction transaction = new Transaction(new Trader("Pikachu",
                "Berlin", "Germany"), 600);
        boolean realResult = detector.isFraud(transaction);
        checkResults(realResult, false,
                "traderFromGermanyTest2 ");
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
