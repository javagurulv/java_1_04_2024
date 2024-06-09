package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {

    private FraudRule2 rule = new FraudRule2();

    @Test
    void fraudForTransactionAboveMillion(){
        Trader trader = new Trader("The Best trader", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500000);
        boolean result = rule.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    void notFraudForTransactionBelowMillion(){
        Trader trader = new Trader("The Best trader", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        boolean result = rule.isFraud(transaction);
        assertFalse(result);
    }

}