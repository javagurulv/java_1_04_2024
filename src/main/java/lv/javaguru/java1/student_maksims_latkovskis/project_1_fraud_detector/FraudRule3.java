package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule3 implements FraudRule {

    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        else return false;
    }
}
