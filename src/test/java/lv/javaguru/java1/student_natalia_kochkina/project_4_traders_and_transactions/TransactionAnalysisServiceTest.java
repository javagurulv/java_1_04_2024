package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

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
        List<Integer> years = service.findYearsOfTransactions(
                TransactionTestData.getTransactions()
        );
        assertEquals(years.size(), 6);
        assertEquals(2011, years.get(0));
        assertEquals(2012, years.get(1));
        assertEquals(2011, years.get(2));
        assertEquals(2012, years.get(3));
        assertEquals(2012, years.get(4));
        assertEquals(2012, years.get(5));
    }

    @Test
    void shouldFindUniqueYearsOfTransactions() {
        List<Integer> years = service.findUniqueYearsOfTransactions(
                TransactionTestData.getTransactions()
        );
        assertEquals(years.size(), 2);
        assertEquals(2011, years.get(0));
        assertEquals(2012, years.get(1));
    }

    @Test
    void shouldFindUniqueNamesOfTraders() {
        List<String> traderNames = service.findUniqueNamesOfTraders(
                TransactionTestData.getTransactions()
        );
        assertEquals(traderNames.size(), 4);
        assertEquals("Brian", traderNames.get(0));
        assertEquals("Raoul", traderNames.get(1));
        assertEquals("Mario", traderNames.get(2));
        assertEquals("Alan", traderNames.get(3));
    }

    @Test
    void shouldFindUniqueTraderCities() {
        List<String> cities = service.findUniqueTraderCities(
                TransactionTestData.getTransactions()
        );
        assertEquals(cities.size(), 2);
        assertEquals("Cambridge", cities.get(0));
        assertEquals("Milan", cities.get(1));
    }

    @Test
    void shouldFindTraderNamesFromCambridge() {
        List<String> traderNames = service.findTraderNamesFromCambridge(
                TransactionTestData.getTransactions()
        );
        assertEquals(traderNames.size(), 3);
        assertEquals("Brian", traderNames.get(0));
        assertEquals("Raoul", traderNames.get(1));
        assertEquals("Alan", traderNames.get(2));
    }

    @Test
    void shouldFindTraderNamesFromSpecificCity() {
        Set<String> traderNames = service.findTraderNamesFromSpecificCity(
                TransactionTestData.getTransactions(), "Milan"
        );
        assertEquals(traderNames.size(), 1);
        assertTrue(traderNames.contains("Mario"));
    }

    @Test
    void shouldCalculateValueByYear() {
        int value2011 = service.calculateValueByYear(
                TransactionTestData.getTransactions(), 2011
        );
        assertEquals(value2011, 700);

        int value2013 = service.calculateValueByYear(
                TransactionTestData.getTransactions(), 2013
        );
        assertEquals(value2013, 0);
    }

    @Test
    void shouldCalculateTransactionQuantityByYear() {
        int transactionQuantity2012 = service.calculateTransactionQuantityByYear(
                TransactionTestData.getTransactions(), 2012
        );
        assertEquals(transactionQuantity2012, 4);

        int transactionQuantity2013 = service.calculateTransactionQuantityByYear(
                TransactionTestData.getTransactions(), 2013
        );
        assertEquals(transactionQuantity2013, 0);
    }

    @Test
    void shouldFindTraderWithMaxTransactionQuantity() {
        List<String> traders = service.findTraderWithMaxTransactionQuantity(
                TransactionTestData.getTransactions()
        );
        assertEquals(traders.size(), 2);
        assertEquals("Raoul", traders.get(0));
        assertEquals("Mario", traders.get(1));
    }

    @Test
    void shouldFindTraderWithMaxTransactionValue() {
        List<String> traders = service.findTraderWithMaxTransactionValue(
                TransactionTestData.getTransactions()
        );
        assertEquals(traders.size(), 1);
        assertEquals("Mario", traders.get(0));
    }

    @Test
    void shouldFindTransactionsWithMaxValue() {
        List<Transaction> transactions = service.findTransactionsWithMaxValue(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 1);
        assertEquals(transactions.get(0).getValue(), 1000);
    }

    @Test
    void shouldFindTransactionsWithMinValue() {
        List<Transaction> transactions = service.findTransactionsWithMinValue(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 1);
        assertEquals(transactions.get(0).getValue(), 300);
    }

    @Test
    void shouldCalculateTransactionsAverageValue() {
        double average = service.calculateTransactionsAverageValue(
                TransactionTestData.getTransactions()
        );
        assertEquals(average, 676.66, 0.01);
    }

}