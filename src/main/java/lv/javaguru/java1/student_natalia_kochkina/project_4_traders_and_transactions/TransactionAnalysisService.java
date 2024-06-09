package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionsIn2011Year(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsByValueASC(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortTransactionsByValueDesc(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsIn2011YearAndSortByValueASC(
            List<Transaction> allTransactions) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> findYearsOfTransactions(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    List<Integer> findUniqueYearsOfTransactions(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getYear).distinct()
                .collect(Collectors.toList());
    }

    List<String> findUniqueNamesOfTraders(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct().collect(Collectors.toList());
    }

    List<String> findUniqueTraderCities(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct().collect(Collectors.toList());
    }

    List<String> findTraderNamesFromCambridge(List<Transaction> allTransactions) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct().collect(Collectors.toList());
    }

    Set<String> findTraderNamesFromSpecificCity(List<Transaction> allTransactions,
                                                String city) {
        return allTransactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    int calculateValueByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .map(Transaction::getValue).reduce(Integer::sum).orElse(0);
    }

    int calculateTransactionQuantityByYear(List<Transaction> allTransactions, int year) {
        return (int) allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year).count();
    }

    List<String> findTraderWithMaxTransactionQuantity(List<Transaction> allTransactions) {
        Map<String, Long> traders = allTransactions.stream()
                .map(Transaction::getTrader).map(Trader::getName)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        long maxTransactionQuantity = traders.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue).orElse(0L);

        return traders.entrySet().stream()
                .filter(trader -> trader.getValue().equals(maxTransactionQuantity))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    List<String> findTraderWithMaxTransactionValue(List<Transaction> allTransactions) {
        int maxTransactionValue = allTransactions.stream()
                .map(transaction -> calculateTotalValueOfTraderTransactions(allTransactions, transaction))
                .max(Integer::compare).orElse(0);

        return allTransactions.stream()
                .filter(transaction -> calculateTotalValueOfTraderTransactions(allTransactions, transaction)
                        == maxTransactionValue)
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsWithMaxValue(List<Transaction> allTransactions) {
        int maxValue = allTransactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare).orElse(0);

        return allTransactions.stream()
                .filter(transaction -> transaction.getValue() == maxValue)
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsWithMinValue(List<Transaction> allTransactions) {
        int minValue = allTransactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare).orElse(0);

        return allTransactions.stream()
                .filter(transaction -> transaction.getValue() == minValue)
                .collect(Collectors.toList());
    }

    double calculateTransactionsAverageValue(List<Transaction> allTransactions) {
        int valueSum = allTransactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::sum).orElse(0);
        return (double) valueSum / allTransactions.size();
    }

    private int calculateTotalValueOfTraderTransactions(List<Transaction> allTransactions,
                                                        Transaction thisTransaction) {
        int totalValue = 0;
        for (Transaction transaction: allTransactions) {
            if (thisTransaction.getTrader()
                    .equals(transaction.getTrader())) {
                totalValue += transaction.getValue();
            }
        }
        return totalValue;
    }

}
