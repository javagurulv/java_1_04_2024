package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    void shouldFindTransactionsFor2011Year() {
        List<Transaction> transactions = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2011
        );
        assertEquals(transactions.size(), 2);
    }

    @Test
    void shouldFindTransactionsFor2012Year() {
        List<Transaction> transactions = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2012
        );
        assertEquals(transactions.size(), 4);
    }

    @Test
    void shouldFindTransactionsFor2013Year() {
        List<Transaction> transactions = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2013
        );
        assertEquals(transactions.size(), 0);
    }

}