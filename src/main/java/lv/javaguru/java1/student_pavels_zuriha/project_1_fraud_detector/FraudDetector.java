package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        String trader = String.valueOf(transaction.getTrader().getFullName());
        if (trader.equals("Pokemon")) {
            return false;
        } else {
            return true;
        }
    }
}
