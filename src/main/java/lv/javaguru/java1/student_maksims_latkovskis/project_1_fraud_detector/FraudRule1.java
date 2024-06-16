package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule1 implements FraudRule {

    public boolean isFraud(Transaction transaction){
        if(transaction.getTrader().getFullName().equals("Pokemon")){
            return true;
        }
        else return false;
    }
}
