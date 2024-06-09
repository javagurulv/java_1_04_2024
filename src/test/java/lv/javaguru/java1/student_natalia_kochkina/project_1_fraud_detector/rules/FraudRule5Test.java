package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.rules;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {

    private FraudRule5 fraudRule5 = new FraudRule5();

    @Test
    void transactionFromGermanyMoreThan1000ShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        boolean result = fraudRule5.isFraud(new Transaction(trader, 50000));
        assertTrue(result);
    }

    @Test
    void transactionFromGermanyLessThan1000ShouldBeNotFraud() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        boolean result = fraudRule5.isFraud(new Transaction(trader, 500));
        assertFalse(result);
    }

    @Test
    void transactionNotFromGermanyMoreThan1000ShouldBeNotFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = fraudRule5.isFraud(new Transaction(trader, 500000));
        assertFalse(result);
    }

}