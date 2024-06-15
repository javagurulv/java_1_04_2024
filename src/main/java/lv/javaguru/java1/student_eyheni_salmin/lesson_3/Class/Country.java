package lv.javaguru.java1.student_eyheni_salmin.lesson_3.Class;

public class Country {

    private String name;
    private String code;
    private int peopleQuantity;

    public Country() {}
    public Country(String name, String code, int peopleQuantity) {
        this.name = name;
        this.code = code;
        this.peopleQuantity = peopleQuantity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity(int peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + getName() + '\'' +
                ", code='" + getCode() + '\'' +
                ", peopleQuantity=" + getPeopleQuantity() +
                '}';
    }
}
