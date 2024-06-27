package lv.javaguru.java1.student_deniss_boltunovs.project_5_property_insurance_calculator;

import java.math.BigDecimal;

class InsuredSubObject {

      private String name;
      private BigDecimal sum;
      private RiskType risk;

      InsuredSubObject(String name,
                       BigDecimal sum,
                       RiskType risk) {
          this.name = name;
          this.sum = sum;
          this.risk = risk;
      }

    public String getName() {
        return name;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public RiskType getRisk() {
        return risk;
    }


}
