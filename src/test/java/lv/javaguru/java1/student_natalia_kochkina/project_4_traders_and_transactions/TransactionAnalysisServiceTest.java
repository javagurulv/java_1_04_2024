package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    void shouldFindTransactionsFor2011Year() {
        List<Transaction> transactions = service.findTransactionsFor2011Year(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 2);
    }

}