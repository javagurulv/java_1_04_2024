package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.List;

class InsuredSubObject {

    private String name;
    private BigDecimal sumInsured;
    private List<RiskType> riskTypes;

    public InsuredSubObject(String name,
                            BigDecimal sumInsured,
                            List<RiskType> riskTypes) {
        this.name = name;
        this.sumInsured = sumInsured;
        this.riskTypes = riskTypes;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public List<RiskType> getRiskTypes() {
        return riskTypes;
    }

}
