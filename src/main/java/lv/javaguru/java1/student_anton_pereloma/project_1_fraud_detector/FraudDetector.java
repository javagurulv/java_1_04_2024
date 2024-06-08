package lv.javaguru.java1.student_anton_pereloma.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equalsIgnoreCase("pokemon") ||
                transaction.getAmount() >= 1000000 ||
                transaction.getTrader().getCity().equalsIgnoreCase("sydney");
    }


}
