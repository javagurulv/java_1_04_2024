package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.util.List;

class Policy {

    private String policyNumber;
    private PolicyStatus status;
    private List<InsuredObject> objects;

    public Policy(String policyNumber, PolicyStatus status, List<InsuredObject> objects) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.objects = objects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuredObject> getObjects() {
        return objects;
    }

}
