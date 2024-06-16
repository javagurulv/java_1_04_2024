package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule2 {

    boolean fraudRule2(Transaction transaction){
        if(transaction.getAmount() > 1000000){
            return false;
        }
        else return true;
    }
}
