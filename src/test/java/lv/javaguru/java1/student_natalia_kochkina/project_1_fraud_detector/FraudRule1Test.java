package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    private FraudRule1 fraudRule1 = new FraudRule1();

    @Test
    void namePokemonShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = fraudRule1.isFraud(new Transaction(trader, 50000));
        assertTrue(result);
    }

    @Test
    void nameNotPokemonShouldBeNotFraud() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        boolean result = fraudRule1.isFraud(new Transaction(trader, 50000));
        assertFalse(result);
    }
}