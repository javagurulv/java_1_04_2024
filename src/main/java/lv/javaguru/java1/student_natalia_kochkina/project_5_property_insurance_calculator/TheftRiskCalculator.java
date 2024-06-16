package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;

class TheftRiskCalculator implements RiskTypeCalculator {
    @Override
    public BigDecimal calculatePremium(InsuredObject object) {
        return calculateSumInsuredTheft(object)
                .multiply(calculateCoefficientTheft(object));
    }

    private static final BigDecimal DEFAULT_COEFFICIENT_THEFT = new BigDecimal("0.11");
    private static final BigDecimal COEFFICIENT_THEFT = new BigDecimal("0.05");
    private static final BigDecimal THEFT_SUM_INSURED_LIMIT = new BigDecimal("15");

    private BigDecimal calculateCoefficientTheft(InsuredObject object) {
        return calculateSumInsuredTheft(object).compareTo(THEFT_SUM_INSURED_LIMIT) >= 0
                ? COEFFICIENT_THEFT
                : DEFAULT_COEFFICIENT_THEFT;
    }

    private BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRiskTypes()
                        .contains(RiskType.THEFT))
                .map(InsuredSubObject::getSumInsured)
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

}
