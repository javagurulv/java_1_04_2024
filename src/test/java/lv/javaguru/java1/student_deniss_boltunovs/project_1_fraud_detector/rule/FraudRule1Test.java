package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    private FraudRule1 rule = new FraudRule1();

    @Test
    void fraudForTraderPokemon(){
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        boolean result = rule.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    void notFraudForTraderJohnyBravo(){
        Trader trader = new Trader("Johny Bravo", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        boolean result = rule.isFraud(transaction);
        assertFalse(result);
    }

}