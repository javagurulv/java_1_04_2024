package lv.javaguru.java1.student_deniss_boltunovs.project_4_traders_and_transactions;

import java.util.List;
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


}
