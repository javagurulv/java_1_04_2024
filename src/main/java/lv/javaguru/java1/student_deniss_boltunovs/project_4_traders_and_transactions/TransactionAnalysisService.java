package lv.javaguru.java1.student_deniss_boltunovs.project_4_traders_and_transactions;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> returnTransactionForYear2011(List<Transaction> transactions){
         return transactions.stream()
                 .filter(t -> t.getYear() == 2011)
                 .collect(Collectors.toList());
    }

    List<Transaction> returnTransactionForSelectedYear(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> returnTransactionSortedAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList()) ;
    }


    List<Transaction> returnTransactionSortedDesc(List<Transaction> transactions){
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> returnTransactionForSelectedYearSortedAsc(List<Transaction> transactions, int year){
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> returnTransactionYear(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    List<Integer> returnTransactionUniqueYear(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct().collect(Collectors.toList());
    }

//    Set<Integer> returnTransactionUniqueYearV2(List<Transaction> transactions) {
//        return transactions.stream()
//                .map(Transaction::getYear)
//                .collect(Collectors.toSet());
//    }


    Set<String> returnUniqueTrader(List<Transaction> transactions) {
         return transactions.stream()
                 .map(Transaction::getTrader)
                 .map(Trader::getName)
                 .collect(Collectors.toSet());
    }

    Set<String> returnUniqueTraderCity(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }



}
