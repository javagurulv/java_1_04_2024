package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule3 {

    boolean fraudRule3(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sydney")) {
            return false;
        }
        else return true;
    }
}
