package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule2 implements FraudRule {

    public FraudDetectionResult isFraud(Transaction transaction){
        if(transaction.getAmount() > 1000000){
            return new FraudDetectionResult(true, "FraudRule2");
        }
        else return new FraudDetectionResult(false, null);
    }

    public String getRuleName(){
        return "FraudRule2";
    }
}
