package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {

    private FraudRule2 fraudRule2 = new FraudRule2();

    @Test
    void amountMoreThan1000000ShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = fraudRule2.isFraud(new Transaction(trader, 1200000));
        assertTrue(result);
    }

    @Test
    void amount50000ShouldBeNotFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = fraudRule2.isFraud(new Transaction(trader, 50000));
        assertFalse(result);
    }

}