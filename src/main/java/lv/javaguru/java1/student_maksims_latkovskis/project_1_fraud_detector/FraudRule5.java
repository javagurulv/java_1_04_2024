package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule5 implements FraudRule{
    public FraudDetectionResult isFraud(Transaction transaction) {
       if(transaction.getTrader().getCountry().equals("Germany") && (transaction.getAmount() > 1000)){
            return new FraudDetectionResult(true, "FraudRule5");
        }
        else return new FraudDetectionResult(false, null);
    }

    public String getRuleName(){
        return "FraudRule5";
    }
}
