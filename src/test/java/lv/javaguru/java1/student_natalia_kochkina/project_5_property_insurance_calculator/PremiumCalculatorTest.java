package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorTest {

    private PremiumCalculator calculator = new PremiumCalculator();

    //one object, one sub-object, risk fire, sumInsured < 100
    @Test
    void oneObjectOneSubObjectFireSumInsuredLess100() {
        InsuredSubObject tv = createSubObject("TV", "80", RiskType.FIRE);
        InsuredObject house = createObject("House", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("1.12"));
    }

    //one object, one sub-object, risk fire, sumInsured > 100
    @Test
    void oneObjectOneSubObjectFireSumInsuredOver100() {
        InsuredSubObject tv = createSubObject("TV", "120", RiskType.FIRE);
        InsuredObject house = createObject("House", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.APPROVED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("2.88"));

    }
    //one object, two sub-objects, risk fire, sumInsured = 100
    @Test
    void oneObjectTwoSubObjectsFireSumInsured100() {
        InsuredSubObject tv = createSubObject("TV", "50", RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge", "50", RiskType.FIRE);
        InsuredObject house = createObject("House", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("1.40"));
    }

    //one object, two sub-objects, risk fire, sumInsured > 100
    @Test
    void oneObjectTwoSubObjectsFireSumInsuredOver100() {
        InsuredSubObject tv = createSubObject("TV", "500", RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge", "50", RiskType.FIRE);
        InsuredObject house = createObject("House", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("13.20"));
    }

    //one object, one sub-object, risk theft, sumInsured < 15
    @Test
    void oneObjectOneSubObjectTheftSumInsuredLess15() {
        InsuredSubObject tv = createSubObject("TV", "12", RiskType.THEFT);
        InsuredObject house = createObject("House", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("1.32"));
    }

    //one object, one sub-object, risk theft, sumInsured > 15
    @Test
    void oneObjectOneSubObjectTheftSumInsuredOver15() {
        InsuredSubObject tv = createSubObject("TV", "50", RiskType.THEFT);
        InsuredObject house = createObject("House", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("2.50"));
    }

    //one object, two sub-objects, risk theft, sumInsured < 15
    @Test
    void oneObjectTwoSubObjectsTheftSumInsuredLess15() {
        InsuredSubObject tv = createSubObject("TV", "5", RiskType.THEFT);
        InsuredSubObject fridge = createSubObject("Fridge", "6.5", RiskType.THEFT);
        InsuredObject house = createObject("House", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("1.27"));
    }

    //one object, two sub-objects, risk theft, sumInsured > 15
    @Test
    void oneObjectTwoSubObjectsTheftSumInsuredOver15() {
        InsuredSubObject tv = createSubObject("TV", "50", RiskType.THEFT);
        InsuredSubObject fridge = createSubObject("Fridge", "66", RiskType.THEFT);
        InsuredObject house = createObject("House", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("5.80"));
    }

    //one object, one sub-object, risk theft and fire, sumInsured > 100
    @Test
    void oneObjectOneSubObjectFireAndTheftSumInsuredOver100() {
        InsuredSubObject tv = createSubObject("TV",
                "1160", RiskType.THEFT, RiskType.FIRE);
        InsuredObject house = createObject("House", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("85.84"));
    }

    //one object, two sub-objects, risk theft and fire, sumInsured < 15
    @Test
    void oneObjectTwoSubObjectsFireAndTheftSumInsuredLess15() {
        InsuredSubObject tv = createSubObject("TV",
                "4", RiskType.THEFT, RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge",
                "9", RiskType.THEFT, RiskType.FIRE);
        InsuredObject house = createObject("House", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("1.61"));
    }

    //two objects, one sub-object, risk theft and fire, sumInsured < 100, > 15
    @Test
    void twoObjectsTwoSubObjectsFireAndTheftSumInsuredLess100Over15() {
        InsuredSubObject tv = createSubObject("TV",
                "40", RiskType.THEFT, RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge",
                "55", RiskType.THEFT, RiskType.FIRE);
        InsuredObject house = createObject("House", tv);
        InsuredObject apartment = createObject("Apartment", fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, house, apartment);
        BigDecimal premium = calculator.calculate(policy);
        assertEquals(premium, new BigDecimal("6.08"));
    }


    private static Policy createPolicy(String name,
                                       PolicyStatus status,
                                       InsuredObject ... objects) {
        return new Policy(name,
                status,
                Arrays.stream(objects).toList());
    }

    private static InsuredObject createObject(String name,
                                              InsuredSubObject ... subObjects) {
        return new InsuredObject(name,
                Arrays.stream(subObjects).toList());
    }

    private static InsuredSubObject createSubObject(String name,
                                                    String sumInsured,
                                                    RiskType ... riskTypes) {
        return new InsuredSubObject(name,
                new BigDecimal(sumInsured),
                Arrays.stream(riskTypes).toList());
    }

}