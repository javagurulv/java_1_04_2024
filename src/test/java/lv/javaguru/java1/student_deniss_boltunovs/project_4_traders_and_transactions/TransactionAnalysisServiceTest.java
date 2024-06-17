package lv.javaguru.java1.student_deniss_boltunovs.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    List<Transaction> testData = TransactionTestData.getTransactions();
    TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    void shouldReturnOnlyTransactionsForYear2011(){
        List<Transaction> result = service.returnTransactionForSelectedYear(testData, 2011);
        assertEquals(2, result.size());
    }

    @Test
    void shouldReturnOnlyTransactionsForYear2012(){
        List<Transaction> result = service.returnTransactionForSelectedYear(testData, 2012);
        assertEquals(4, result.size());
    }

    @Test
    void shouldReturnSortedTransactions() {
        List<Transaction> result = service.returnTransactionSortedASC(testData);
        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);
        assertEquals(result.get(2).getValue(), 700);
        assertEquals(result.get(3).getValue(), 710);
        assertEquals(result.get(4).getValue(), 950);
        assertEquals(result.get(5).getValue(), 1000);
    }

}