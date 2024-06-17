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
    void shouldReturnTransactionSortedAsc() {
        List<Transaction> result = service.returnTransactionSortedAsc(testData);
        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);
        assertEquals(result.get(2).getValue(), 700);
        assertEquals(result.get(3).getValue(), 710);
        assertEquals(result.get(4).getValue(), 950);
        assertEquals(result.get(5).getValue(), 1000);
    }

    @Test
    void shouldReturnTransactionSortedDesc() {
        List<Transaction> result = service.returnTransactionSortedDesc(testData);
        assertEquals(result.get(0).getValue(), 1000);
        assertEquals(result.get(1).getValue(), 950);
        assertEquals(result.get(2).getValue(), 710);
        assertEquals(result.get(3).getValue(), 700);
        assertEquals(result.get(4).getValue(), 400);
        assertEquals(result.get(5).getValue(), 300);
    }

    @Test
    void shouldReturnTransactionForYear2011SortedDesc() {
        List<Transaction> result = service.returnTransactionForSelectedYearSortedAsc(testData, 2011);
        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);
    }

    @Test
    void shouldReturnTransactionYears() {
        List<Integer> result = service.returnTransactionYear(testData);
        assertEquals(result.get(0), 2011);
        assertEquals(result.get(1), 2012);
        assertEquals(result.get(2), 2011);
        assertEquals(result.get(3), 2012);
        assertEquals(result.get(4), 2012);
        assertEquals(result.get(5), 2012);
    }

    @Test
    void shouldReturnTransactionUniqueYears() {
        List<Integer> result = service.returnTransactionUniqueYear(testData);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0), 2011);
        assertEquals(result.get(1), 2012);
    }

}