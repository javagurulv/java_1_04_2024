package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetectionResult {

     private boolean fraud;
     private String ruleName;

     FraudDetectionResult(boolean fraud, String ruleName) {
         this.fraud = fraud;
         this.ruleName = ruleName;
     }

     public boolean getFraud() {
         return this.fraud;
     }

     public String getRuleName() {
         return this.ruleName;
     }

}
