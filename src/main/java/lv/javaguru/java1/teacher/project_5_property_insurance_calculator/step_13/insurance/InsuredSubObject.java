package lv.javaguru.java1.teacher.project_5_property_insurance_calculator.step_13.insurance;

import java.math.BigDecimal;
import java.util.List;

public class InsuredSubObject {

    private String name;
    private BigDecimal sum;
    private List<RiskType> risks;

    public InsuredSubObject(String name,
                            BigDecimal sum,
                            List<RiskType> risks) {
        this.name = name;
        this.sum = sum;
        this.risks = risks;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public List<RiskType> getRisks() {
        return risks;
    }
}
