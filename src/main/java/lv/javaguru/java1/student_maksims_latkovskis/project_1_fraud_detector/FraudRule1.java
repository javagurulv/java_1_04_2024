package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule1 implements FraudRule {

    public FraudDetectionResult isFraud(Transaction transaction){
        if(transaction.getTrader().getFullName().equals("Pokemon")){
            return new FraudDetectionResult(true, "FraudRule1");
        }
        else return new FraudDetectionResult(false, null);
    }

    public String getRuleName(){
        return "FraudRule1";
    }

}
