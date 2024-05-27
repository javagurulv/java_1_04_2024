package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return detectPokemon(transaction) && detectMoreMillionTransaction(transaction);
    }

    //Rule 1: трейдер по имени "Pokemon" является мошенником,
    //все его транзакции должны быть отклонены.
    private boolean detectPokemon(Transaction transaction) {
        return !transaction.getTrader().getFullName().equals("Pokemon");
    }

    //- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
    private boolean detectMoreMillionTransaction(Transaction transaction) {
        return transaction.getAmount() <= 1000000;
    }

}
