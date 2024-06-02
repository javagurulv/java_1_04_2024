package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class TransactionsAbove1MillionChecker {

    public boolean transactionAbove1Million(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return false;
        } else {
            return true;
        }
    }
}
