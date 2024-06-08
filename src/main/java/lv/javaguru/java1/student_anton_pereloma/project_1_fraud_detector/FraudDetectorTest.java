package lv.javaguru.java1.student_anton_pereloma.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldCatchPokemon();
        test.transactionAmount1ValidName();
        test.transactionAmountOver1MillionValidName();
        test.transactionAmountOver1MillionAndInvalidName();
        test.transactionAmount10kValidName();
        test.transactionAmount0ValidName();
        test.transactionAmount0ValidNameBlockedRegion();
        test.transactionAmount10kValidNameBlockedRegion();
        test.transactionAmountOver1MillionAndInvalidNameAndBlockedRegion();
    }

    public void shouldCatchPokemon () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Pokemon","Kathmandu");
        Transaction transaction1 = new Transaction(trader1,1);

//        boolean result = fraudDetector.isFraud(new Transaction(new Trader("Pokemon","Kathmandu"),1));
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"shouldCatchPokemon");
    }

    public void transactionAmount1ValidName () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","NYC");
        Transaction transaction1 = new Transaction(trader1,1);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,false,"transactionAmount1ValidName");
    }

    public void transactionAmountOver1MillionValidName () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","NYC");
        Transaction transaction1 = new Transaction(trader1,100000000);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"transactionAmountOver1MillionValidName");
    }

    public void transactionAmountOver1MillionAndInvalidName () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Pokemon","NYC");
        Transaction transaction1 = new Transaction(trader1,100000000);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"transactionAmount1MillionAndInvalidName");
    }

    public void transactionAmount10kValidName () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","NYC");
        Transaction transaction1 = new Transaction(trader1,10000);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,false,"transactionAmount10kValidName");
    }

    public void transactionAmount0ValidName () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","NYC");
        Transaction transaction1 = new Transaction(trader1,0);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,false,"transactionAmount0ValidName");
    }

    public void transactionAmountOver1MillionAndInvalidNameAndBlockedRegion () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Pokemon","Sydney");
        Transaction transaction1 = new Transaction(trader1,100000000);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"transactionAmountOver1MillionAndInvalidNameAndBlockedRegion");
    }

    public void transactionAmount10kValidNameBlockedRegion () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","Sydney");
        Transaction transaction1 = new Transaction(trader1,10000);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"transactionAmount10kValidNameBlockedRegion");
    }

    public void transactionAmount0ValidNameBlockedRegion () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("JohnDoe","Sydney");
        Transaction transaction1 = new Transaction(trader1,0);
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"transactionAmount0ValidNameBlockedRegion");
    }

    private void checkResult(boolean result,
                             boolean expectedResult,
                             String testScenarioName) {
        if (result == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
