package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    void shouldFindTransactionsIn2011Year() {
        List<Transaction> transactions = service.findTransactionsIn2011Year(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 2);
    }

    @Test
    void shouldFindTransactionsByYear() {
        List<Transaction> transactions2012 = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2012
        );
        assertEquals(transactions2012.size(), 4);

        List<Transaction> transactions2013 = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2013
        );
        assertEquals(transactions2013.size(), 0);
    }

    @Test
    void shouldSortTransactionsByValue() {
        List<Transaction> transactions = service.sortTransactionsByValue(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 6);
        assertEquals(300, transactions.get(0).getValue());
        assertEquals(400, transactions.get(1).getValue());
        assertEquals(700, transactions.get(2).getValue());
        assertEquals(710, transactions.get(3).getValue());
        assertEquals(950, transactions.get(4).getValue());
        assertEquals(1000, transactions.get(5).getValue());
    }

}