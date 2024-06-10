package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Trader;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    private FraudDetector detector = new FraudDetector();

    @Test
    void fraudForPokemon() {
        Trader trader = new Trader("Pokemon", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        boolean result = detector.isFraud(transaction).getFraud();
        assertTrue(result);
    }

    @Test
    void notFraudForJohnyBravo() {
        Trader trader = new Trader("Johny Bravo", "London", "UK");
        Transaction transaction = new Transaction(trader, 1500);
        boolean result = detector.isFraud(transaction).getFraud();
        assertFalse(result);
    }

    @Test
    void fraudForCountryGermanyAndTransactionAbove1k() {
        Trader trader = new Trader("Albert How", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1998);
        boolean result = detector.isFraud(transaction).getFraud();
        assertTrue(result);
    }


}