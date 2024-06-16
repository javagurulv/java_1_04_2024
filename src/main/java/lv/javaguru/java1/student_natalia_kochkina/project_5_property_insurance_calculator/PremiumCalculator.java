package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PremiumCalculator {

    private static final BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final BigDecimal DEFAULT_COEFFICIENT_THEFT = new BigDecimal("0.11");
    private static final BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final BigDecimal COEFFICIENT_THEFT = new BigDecimal("0.05");
    private static final BigDecimal FIRE_SUM_INSURED_LIMIT = new BigDecimal("100");
    private static final BigDecimal THEFT_SUM_INSURED_LIMIT = new BigDecimal("15");

    BigDecimal calculate(Policy policy) {
        BigDecimal premium = policy.getObjects().stream()
                .map(this::calculatePremiumForObject)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return premium.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculatePremiumForObject(InsuredObject object) {
        return calculatePremiumFire(object)
                .add(calculatePremiumTheft(object));
    }

    private BigDecimal calculatePremiumFire(InsuredObject object) {
        return calculateSumInsuredFire(object)
                .multiply(calculateCoefficientFire(object));
    }

    private BigDecimal calculatePremiumTheft(InsuredObject object) {
        return calculateSumInsuredTheft(object)
                .multiply(calculateCoefficientTheft(object));
    }

    private BigDecimal calculateCoefficientFire(InsuredObject object) {
        return calculateSumInsuredFire(object).compareTo(FIRE_SUM_INSURED_LIMIT) > 0
                ? COEFFICIENT_FIRE
                : DEFAULT_COEFFICIENT_FIRE;
    }

    private BigDecimal calculateCoefficientTheft(InsuredObject object) {
        return calculateSumInsuredTheft(object).compareTo(THEFT_SUM_INSURED_LIMIT) >= 0
                ? COEFFICIENT_THEFT
                : DEFAULT_COEFFICIENT_THEFT;
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRiskTypes()
                        .contains(RiskType.FIRE))
                .map(InsuredSubObject::getSumInsured)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    private BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRiskTypes()
                        .contains(RiskType.THEFT))
                .map(InsuredSubObject::getSumInsured)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

}
