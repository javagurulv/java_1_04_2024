package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
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

}
