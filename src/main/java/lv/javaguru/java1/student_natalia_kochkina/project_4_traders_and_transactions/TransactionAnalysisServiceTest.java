package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import java.util.Arrays;
import java.util.List;

class TransactionAnalysisServiceTest {

    public static void main(String[] args) {
        TransactionAnalysisServiceTest test = new TransactionAnalysisServiceTest();
        test.findTransactionsFor2011YearTest();
    }

    public void findTransactionsFor2011YearTest() {
        TransactionAnalysisService analysisService = new TransactionAnalysisService();
        List<Transaction> allTransactions = TransactionTestData.getTransactions();
        List<Transaction> realResult = analysisService
                .findTransactionsFor2011Year(allTransactions);

        Trader brian = new Trader("Brian","Cambridge");
        Trader raoul = new Trader("Raoul", "Cambridge");
        List<Transaction> expectedResult = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );

        checkResult(realResult, expectedResult,
                "FindTransactionsFor2011Year");
    }

    private void checkResult(List realResult,
                             List expectedResult,
                             String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

}
