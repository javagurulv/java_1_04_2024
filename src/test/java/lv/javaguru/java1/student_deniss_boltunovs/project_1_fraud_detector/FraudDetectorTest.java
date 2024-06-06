package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

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


}