package lv.javaguru.java1.student_natalia_kochkina.project_5_property_insurance_calculator;

import java.util.List;

class InsuredObject {

    private String name;
    private List<InsuredSubObject> subObjects;

    public InsuredObject(String name,
                         List<InsuredSubObject> subObjects) {
        this.name = name;
        this.subObjects = subObjects;
    }

    public String getName() {
        return name;
    }

    public List<InsuredSubObject> getSubObjects() {
        return subObjects;
    }

}
