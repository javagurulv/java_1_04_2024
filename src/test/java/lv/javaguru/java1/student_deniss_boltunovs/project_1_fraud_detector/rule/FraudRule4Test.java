package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {

    private FraudRule4 rule = new FraudRule4();

    @Test
    void fraudForCountryJamaica() {
        Trader trader = new Trader("Johny Tapia", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 5670);
        boolean result = rule.isFraud(transaction);
        assertTrue(result);
    }


    @Test
    void notFraudForCountryCanada() {
        Trader trader = new Trader("Albert How", "Toronto", "Canada");
        Transaction transaction = new Transaction(trader, 5670);
        boolean result = rule.isFraud(transaction);
        assertFalse(result);
    }

}