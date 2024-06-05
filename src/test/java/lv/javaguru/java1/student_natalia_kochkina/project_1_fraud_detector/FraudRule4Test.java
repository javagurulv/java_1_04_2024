package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {

    private FraudRule4 fraudRule4 = new FraudRule4();

    @Test
    void transactionFromJamaicaShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Kingston", "Jamaica");
        boolean result = fraudRule4.isFraud(new Transaction(trader, 50000));
        assertTrue(result);
    }

    @Test
    void transactionNotFromJamaicaShouldBeNotFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = fraudRule4.isFraud(new Transaction(trader, 50000));
        assertFalse(result);
    }
}