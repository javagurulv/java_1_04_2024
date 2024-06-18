package lv.javaguru.java1.student_deniss_boltunovs.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Set;
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
        assertEquals(300, result.get(0).getValue());
        assertEquals(400, result.get(1).getValue());
        assertEquals(700, result.get(2).getValue());
        assertEquals(710, result.get(3).getValue());
        assertEquals(950, result.get(4).getValue());
        assertEquals(1000,result.get(5).getValue());
    }

    @Test
    void shouldReturnTransactionSortedDesc() {
        List<Transaction> result = service.returnTransactionSortedDesc(testData);
        assertEquals(1000,result.get(0).getValue());
        assertEquals(950, result.get(1).getValue());
        assertEquals(710, result.get(2).getValue());
        assertEquals(700, result.get(3).getValue());
        assertEquals(400, result.get(4).getValue());
        assertEquals(300, result.get(5).getValue());
    }

    @Test
    void shouldReturnTransactionForYear2011SortedDesc() {
        List<Transaction> result = service.returnTransactionForSelectedYearSortedAsc(testData, 2011);
        assertEquals(300, result.get(0).getValue());
        assertEquals(400, result.get(1).getValue());
    }

    @Test
    void shouldReturnTransactionYears() {
        List<Integer> result = service.returnTransactionYear(testData);
        assertEquals(2011, result.get(0));
        assertEquals(2012, result.get(1));
        assertEquals(2011, result.get(2));
        assertEquals(2012, result.get(3));
        assertEquals(2012, result.get(4));
        assertEquals(2012, result.get(5));
    }

    @Test
    void shouldReturnTransactionUniqueYears() {
        List<Integer> result = service.returnTransactionUniqueYear(testData);
        assertEquals(2, result.size());
        assertEquals(2011, result.get(0));
        assertEquals(2012, result.get(1));
    }

    @Test
    void shouldReturnTransactionUniqueTraderNames(){
        Set<String> result = service.returnUniqueTraderNames(testData);
        assertEquals(4, result.size());
        assertTrue(result.contains("Brian"));
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Mario"));
        assertTrue(result.contains("Alan"));
    }

    @Test
    void shouldReturnTransactionUniqueTraderCities(){
        Set<String> result = service.returnUniqueTraderCities(testData);
        assertEquals(2, result.size());
        assertTrue(result.contains("Cambridge"));
        assertTrue(result.contains("Milan"));
    }

    @Test
    void shouldReturnTransactionUniqueTraderFromCityCambridge(){
        Set<String> result = service.returnUniqueTraderFromCityCambridge(testData);
        assertEquals(3, result.size());
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));
    }

    @Test
    void shouldReturnTransactionUniqueTraderFromSelectedCity(){
        Set<String> result = service.returnUniqueTraderFromSelectedCity(testData, "Milan");
        assertEquals(1, result.size());
        assertTrue(result.contains("Mario"));
    }

}