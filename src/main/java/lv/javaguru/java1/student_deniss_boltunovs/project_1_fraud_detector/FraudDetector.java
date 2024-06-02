package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        String traderFullName = transaction.getTrader().getFullName();
        boolean isFraudTransaction = false;

        /*
        Rule 1: трейдер по имени "Pokemon" является мошенником,
        все его транзакции должны быть отклонены.
        */
        if (traderFullName.equals("Pokemon")) {
            isFraudTransaction = true;
        }

        return isFraudTransaction;
    }

}
