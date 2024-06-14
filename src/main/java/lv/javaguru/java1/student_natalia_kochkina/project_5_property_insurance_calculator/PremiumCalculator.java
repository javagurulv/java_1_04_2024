package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PremiumCalculator {

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
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        if (sumInsuredFire.compareTo(new BigDecimal("100")) > 0) {
            return sumInsuredFire.multiply(new BigDecimal("0.024"));
        } else {
            return sumInsuredFire.multiply(new BigDecimal("0.014"));
        }
    }

    private BigDecimal calculatePremiumTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(object);
        if (sumInsuredTheft.compareTo(new BigDecimal("15")) >= 0) {
            return sumInsuredTheft.multiply(new BigDecimal("0.05"));
        } else {
            return sumInsuredTheft.multiply(new BigDecimal("0.11"));
        }
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
