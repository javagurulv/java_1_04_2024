package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {

    private FraudRule5 rule = new FraudRule5();

    @Test
    void fraudForCountryGermanyAndTransactionAbove1k() {
        Trader trader = new Trader("Albert How", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1998);
        boolean result = rule.isFraud(transaction);
        assertTrue(result);
    }


    @Test
    void notFraudForCountryGermanyAndTransactionBelow1k() {
        Trader trader = new Trader("Albert How", "Leipzig", "Germany");
        Transaction transaction = new Transaction(trader, 560);
        boolean result = rule.isFraud(transaction);
        assertFalse(result);
    }

}