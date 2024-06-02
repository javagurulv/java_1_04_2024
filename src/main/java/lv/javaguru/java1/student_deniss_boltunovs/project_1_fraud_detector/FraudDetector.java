package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return (isFraudRule1(transaction) || isFraudRule2(transaction));
    }

    //// trader is Pokemon
    private boolean isFraudRule1(Transaction transaction) {
        String traderFullName = transaction.getTrader().getFullName();
        return traderFullName.equals("Pokemon");
    }

    /// transaction amount > 1mio
    private boolean isFraudRule2(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

}
