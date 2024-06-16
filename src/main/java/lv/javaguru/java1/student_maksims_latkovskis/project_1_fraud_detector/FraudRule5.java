package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule5 {
    boolean fraudRule5(Transaction transaction) {
       if(transaction.getTrader().getCountry().equals("Germany") && (transaction.getAmount() > 1000)){
            return false;
        }
        else return true;
    }



}
