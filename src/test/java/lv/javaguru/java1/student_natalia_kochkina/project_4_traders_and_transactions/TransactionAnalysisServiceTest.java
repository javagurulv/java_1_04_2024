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
    void shouldSortTransactionsByValueASC() {
        List<Transaction> transactions = service.sortTransactionsByValueASC(
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

    @Test
    void shouldSortTransactionsByValueDesc() {
        List<Transaction> transactions = service.sortTransactionsByValueDesc(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 6);
        assertEquals(1000, transactions.get(0).getValue());
        assertEquals(950, transactions.get(1).getValue());
        assertEquals(710, transactions.get(2).getValue());
        assertEquals(700, transactions.get(3).getValue());
        assertEquals(400, transactions.get(4).getValue());
        assertEquals(300, transactions.get(5).getValue());
    }

    @Test
    void shouldFindTransactionsIn2011YearAndSortByValueASC() {
        List<Transaction> transactions = service.findTransactionsIn2011YearAndSortByValueASC(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 2);
        assertEquals(300, transactions.get(0).getValue());
        assertEquals(400, transactions.get(1).getValue());
    }

    @Test
    void shouldFindYearsOfTransactions() {
        List<Integer> transactions = service.findYearsOfTransactions(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 6);
        assertEquals(2011, transactions.get(0));
        assertEquals(2012, transactions.get(1));
        assertEquals(2011, transactions.get(2));
        assertEquals(2012, transactions.get(3));
        assertEquals(2012, transactions.get(4));
        assertEquals(2012, transactions.get(5));
    }

    @Test
    void shouldFindUniqueYearsOfTransactions() {
        List<Integer> transactions = service.findUniqueYearsOfTransactions(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 2);
        assertEquals(2011, transactions.get(0));
        assertEquals(2012, transactions.get(1));
    }

}