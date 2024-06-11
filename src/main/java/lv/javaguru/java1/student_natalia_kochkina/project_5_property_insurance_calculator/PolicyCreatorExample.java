package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;

class PolicyCreatorExample {

    public static void main(String[] args) {
        //- полис с одним объектом страхования и одним под объектом страхования;
        InsuredSubObject tv = createSubObject("TV", "800", RiskType.FIRE);
        InsuredObject house = createObject("House", tv);
        Policy policy1 = createPolicy("LV-20", PolicyStatus.APPROVED, house);

        //- полис с одним объектом страхования и двумя под объектами страхования;
        InsuredSubObject tv1 = createSubObject("TV1", "800", RiskType.FIRE);
        InsuredSubObject tv2 = createSubObject("TV2", "900", RiskType.FIRE);
        InsuredObject house1 = createObject("House1", tv1, tv2);
        Policy policy2 = createPolicy("LV-30", PolicyStatus.APPROVED, house1);

        //- полис с двумя объектами страхования по одному под объекту страхования в каждом.
        InsuredSubObject tv3 = createSubObject("TV3", "400", RiskType.FIRE);
        InsuredSubObject tv4 = createSubObject("TV4", "900", RiskType.FIRE);
        InsuredObject house2 = createObject("House2", tv3);
        InsuredObject house3 = createObject("House3", tv4);
        Policy policy3 = createPolicy("LV-40", PolicyStatus.REGISTERED, house2, house3);
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
