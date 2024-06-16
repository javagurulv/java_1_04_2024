package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

class PremiumCalculator {

    List<RiskTypeCalculator> calculators = List.of(new FireRiskCalculator(),
            new TheftRiskCalculator(),
            new FloodRiskCalculator());

    BigDecimal calculate(Policy policy) {
        BigDecimal premium = policy.getObjects().stream()
                .map(this::calculatePremiumForObject)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return premium.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculatePremiumForObject(InsuredObject object) {
        return calculators.stream()
                .map(calculator -> calculator.calculatePremium(object))
                .reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

}
