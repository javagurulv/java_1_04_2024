package lv.javaguru.java1.student_deniss_boltunovs.project_5_property_insurance_calculator;

import java.util.List;

class InsuredObject {

    private String objectName;
    private List<InsuredSubObject> subObjects;

    public InsuredObject(String objectName, List<InsuredSubObject> subObjects) {
        this.objectName = objectName;
        this.subObjects = subObjects;
    }

    public String getObjectName() {
        return objectName;
    }

    public List<InsuredSubObject> getSubObjectList() {
        return subObjects;
    }

}
