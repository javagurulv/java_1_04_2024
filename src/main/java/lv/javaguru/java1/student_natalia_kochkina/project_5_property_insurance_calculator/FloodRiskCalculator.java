package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;

class FloodRiskCalculator implements RiskTypeCalculator {
    @Override
    public BigDecimal calculatePremium(InsuredObject object) {
        return calculateSumInsuredFlood(object)
                .multiply(calculateCoefficientFlood(object));
    }

    private static final BigDecimal DEFAULT_COEFFICIENT_FLOOD = new BigDecimal("0.014");
    private static final BigDecimal COEFFICIENT_FLOOD = new BigDecimal("0.024");
    private static final BigDecimal FLOOD_SUM_INSURED_LIMIT = new BigDecimal("100");

    private BigDecimal calculateCoefficientFlood(InsuredObject object) {
        return calculateSumInsuredFlood(object).compareTo(FLOOD_SUM_INSURED_LIMIT) >= 0
                ? COEFFICIENT_FLOOD
                : DEFAULT_COEFFICIENT_FLOOD;
    }

    private BigDecimal calculateSumInsuredFlood(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRiskTypes()
                        .contains(RiskType.FLOOD))
                .map(InsuredSubObject::getSumInsured)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

}
