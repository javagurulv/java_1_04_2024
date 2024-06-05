package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.rules;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {

    private FraudRule3 fraudRule3 = new FraudRule3();

    @Test
    void transactionFromSydneyShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Sydney", "Australia");
        boolean result = fraudRule3.isFraud(new Transaction(trader, 50000));
        assertTrue(result);
    }

    @Test
    void transactionNotFromSydneyShouldBeNotFraud() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        boolean result = fraudRule3.isFraud(new Transaction(trader, 50000));
        assertFalse(result);
    }

}