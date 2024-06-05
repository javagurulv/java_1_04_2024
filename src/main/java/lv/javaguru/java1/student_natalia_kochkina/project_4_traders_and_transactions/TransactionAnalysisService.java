package lv.javaguru.java1.student_natalia_kochkina.project_4_traders_and_transactions;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionsByYear(List<Transaction> allTransactions, int year) {
        return allTransactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

}
