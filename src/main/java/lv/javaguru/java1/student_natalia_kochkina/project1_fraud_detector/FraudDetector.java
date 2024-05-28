package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (detectPokemon(transaction)) {
            return true;
        } else if (detectMoreMillionTransaction(transaction)) {
            return true;
        } else if (detectTransactionsFromSydney(transaction)) {
            return true;
        } else {
            return false;
        }
    }

    //Rule 1: трейдер по имени "Pokemon" является мошенником,
    //все его транзакции должны быть отклонены.
    private boolean detectPokemon(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

    //- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
    private boolean detectMoreMillionTransaction(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    //- Rule 3: все транзакции трейдеров из города "Сидней"
    //  должны быть отклонены.
    private boolean detectTransactionsFromSydney(Transaction transaction){
        return transaction.getTrader().getCity().equals("Sydney");
    }

}
