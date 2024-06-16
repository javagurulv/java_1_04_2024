package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule4 {

    boolean fraudRule4(Transaction transaction) {
        if(transaction.getTrader().getCountry().equals("Jamaica")){
            return false;
        }
        else return true;
    }
}
