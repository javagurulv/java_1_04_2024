package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule2 implements FraudRule {

    public boolean isFraud(Transaction transaction){
        if(transaction.getAmount() > 1000000){
            return true;
        }
        else return false;
    }
}
