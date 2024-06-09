package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        if(transaction.getTrader().getFullName().equals("Pokemon")){
            return false;
        }
        else if(transaction.getAmount() > 1000000){
            return false;
        }
        else if(transaction.getTrader().getCity().equals("Sydney")){
            return false;
        }
        else if(transaction.getTrader().getCountry().equals("Jamaica")){
            return false;
        }
        else if(transaction.getTrader().getCountry().equals("Germany") && (transaction.getAmount() > 1000)){
            return false;
        }
        else {
            return true;
        }

    }

}
