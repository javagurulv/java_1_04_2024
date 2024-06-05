package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    private FraudDetector detector = new FraudDetector();

    //Trader's name = Pokemon -> true
    @Test
    void traderNamePokemonShouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 5000));
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule1");
    }

    //Trader's name = Pikachu -> false
    @Test
    void traderNameShouldBeNotFraud() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 5000));
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

    //Transaction's amount = 1500000 -> true
    @Test
    void amountIsTooBigShouldBeFraud() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 1500000));
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule2");
    }

    //Trader's city = Sydney -> true
    @Test
    void citySydneyShouldBeFraud() {
        Trader trader = new Trader("Pikachu", "Sydney", "Australia");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 150000));
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule3");
    }

    //Trader's country = Jamaica -> true
    @Test
    void countryJamaicaShouldBeFraud() {
        Trader trader = new Trader("Pikachu", "Kingston", "Jamaica");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 150000));
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule4");
    }

    //Country = Germany, amount = 100000 -> true
    @Test
    void countryGermanyAndTooBigAmountShouldBeFraud() {
        Trader trader = new Trader("Pikachu", "Berlin", "Germany");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 150000));
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule5");
    }

    //Country = Germany, amount = 600 -> false
    @Test
    void countryGermanyAndAmount600ShouldBeNotFraud() {
        Trader trader = new Trader("Pikachu", "Berlin", "Germany");
        FraudDetectionResult result = detector.isFraud(new Transaction(trader, 600));
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

}