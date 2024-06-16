package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule1 {

    boolean fraudRule1(Transaction transaction){
        if(transaction.getTrader().getFullName().equals("Pokemon")){
            return false;
        }
        else return true;
    }
}
