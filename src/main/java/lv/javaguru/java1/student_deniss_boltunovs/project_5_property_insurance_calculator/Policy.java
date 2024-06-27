package lv.javaguru.java1.student_deniss_boltunovs.project_5_property_insurance_calculator;

import java.util.List;

class Policy {

     private String policyNumber;
     private PolicyStatus policyStatus;
     private List<InsuredObject> insuredObjects;

    public Policy(String policyNumber,
                  PolicyStatus policyStatus,
                  List<InsuredObject> insuredObjects ) {
        this.policyNumber = policyNumber;
        this.policyStatus = policyStatus;
        this.insuredObjects = insuredObjects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public List<InsuredObject> getInsuredObjects(){
        return insuredObjects;
    }

    @Override
    public String toString() {
        return
                "policyNumber = '" + policyNumber + '\'' +
                ", policyStatus = " + policyStatus +
                ", insuredObjects = " + insuredObjects;
    }


}
