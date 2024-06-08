package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {

    private FraudRule3 rule = new FraudRule3();

    @Test
    void fraudForCitySydney() {
        Trader trader = new Trader("Michel Rose", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 567000);
        boolean result = rule.isFraud(transaction);
        assertTrue(result);
    }


    @Test
    void notFraudForCityMelbourne() {
        Trader trader = new Trader("Michel Rose", "Melbourne", "Australia");
        Transaction transaction = new Transaction(trader, 567000);
        boolean result = rule.isFraud(transaction);
        assertFalse(result);
    }

}