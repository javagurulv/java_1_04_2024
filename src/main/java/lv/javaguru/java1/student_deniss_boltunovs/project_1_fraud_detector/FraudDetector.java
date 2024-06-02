package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        String traderFullName = transaction.getTrader().getFullName();
        return traderFullName.equals("Pokemon");
    }

}
