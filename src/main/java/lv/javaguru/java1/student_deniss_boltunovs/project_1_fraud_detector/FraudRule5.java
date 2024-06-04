package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudRule5 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        String country = transaction.getTrader().getCountry();
        int amount = transaction.getAmount();
        return (country.equals("Germany")) && (amount > 1000);
    }

}
