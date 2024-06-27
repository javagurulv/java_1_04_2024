package lv.javaguru.java1.student_deniss_boltunovs.project_5_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;

class PolicyCreatorExample {

    public static void main(String[] args) {

        // Example 1
        InsuredSubObject tv1 = createSubObject("TV", 1000.50, RiskType.FIRE);
        InsuredObject object1 = createInsuredObject("House 1", tv1);
        Policy policy1 = createPolicy("LV-1", PolicyStatus.REGISTERED, object1);

        // Example 2
        InsuredSubObject tv2 = createSubObject("TV", 1000.50, RiskType.FIRE);
        InsuredSubObject fridge2 = createSubObject("Fridge", 500.50, RiskType.THEFT);
        InsuredObject object2 = createInsuredObject("House 2", tv2, fridge2);
        Policy policy2 = createPolicy("LV-2", PolicyStatus.REGISTERED, object2);

        // Example 3
        InsuredSubObject tv31 = createSubObject("TV", 1000.50, RiskType.FIRE);
        InsuredSubObject fridge32 = createSubObject("Fridge", 500.50, RiskType.THEFT);
        InsuredObject object31 = createInsuredObject("House 31", tv2);
        InsuredObject object32 = createInsuredObject("House 32", fridge2);
        Policy policy3 = createPolicy("LV-3", PolicyStatus.APPROVED, object31, object32);

        System.out.println(policy1);
        System.out.println(policy2);
        System.out.println(policy3);

    }

    public static InsuredSubObject createSubObject(String name, double sumInsured, RiskType riskTypes){
        return new InsuredSubObject(name,
                                    new BigDecimal(sumInsured),
                                    riskTypes);
    }

    public static InsuredObject createInsuredObject(String name, InsuredSubObject... insuredSubObjects) {
         return new InsuredObject(name,
                                  Arrays.stream(insuredSubObjects).toList());

    }

    public static Policy  createPolicy(String policyNumber, PolicyStatus policyStatus, InsuredObject ... insuredObjects){
         return new Policy(policyNumber,
                           policyStatus,
                           Arrays.stream(insuredObjects).toList());
    }


}
