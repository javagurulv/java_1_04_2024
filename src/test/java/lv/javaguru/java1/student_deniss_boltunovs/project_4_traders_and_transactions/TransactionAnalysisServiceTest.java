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


}