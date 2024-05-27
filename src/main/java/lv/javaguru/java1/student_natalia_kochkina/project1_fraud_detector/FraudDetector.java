package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return detectPokemon(transaction);
    }

    private boolean detectPokemon(Transaction transaction) {
        return !transaction.getTrader().getFullName().equals("Pokemon");
    }

}
