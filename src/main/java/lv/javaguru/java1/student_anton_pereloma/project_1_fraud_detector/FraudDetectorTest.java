package lv.javaguru.java1.student_anton_pereloma.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.shouldCatchPokemon();
        test.shouldPassFraudDetector();
    }

    public void shouldCatchPokemon () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Pokemon","Riga");
        Transaction transaction1 = new Transaction(trader1,1);

//        boolean result = fraudDetector.isFraud(new Transaction(new Trader("Pokemon","Riga"),1));
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,true,"shouldCatchPokemon");
    }

    public void shouldPassFraudDetector () {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader1 = new Trader("Anton","Riga");
        Transaction transaction1 = new Transaction(trader1,1);

//        boolean result = fraudDetector.isFraud(new Transaction(new Trader("Anton","Riga"),1));
        boolean result = fraudDetector.isFraud(transaction1);
        checkResult(result,false,"shouldPassFraudDetector");
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
