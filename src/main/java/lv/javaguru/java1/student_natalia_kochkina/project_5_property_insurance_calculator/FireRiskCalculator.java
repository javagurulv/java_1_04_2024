package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;

class FireRiskCalculator implements RiskTypeCalculator {
    @Override
    public BigDecimal calculatePremium(InsuredObject object) {
        return calculateSumInsuredFire(object)
                .multiply(calculateCoefficientFire(object));
    }

    private static final BigDecimal DEFAULT_COEFFICIENT_FIRE = new BigDecimal("0.014");
    private static final BigDecimal COEFFICIENT_FIRE = new BigDecimal("0.024");
    private static final BigDecimal FIRE_SUM_INSURED_LIMIT = new BigDecimal("100");

    private BigDecimal calculateCoefficientFire(InsuredObject object) {
        return calculateSumInsuredFire(object).compareTo(FIRE_SUM_INSURED_LIMIT) > 0
                ? COEFFICIENT_FIRE
                : DEFAULT_COEFFICIENT_FIRE;
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRiskTypes()
                        .contains(RiskType.FIRE))
                .map(InsuredSubObject::getSumInsured)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

}
