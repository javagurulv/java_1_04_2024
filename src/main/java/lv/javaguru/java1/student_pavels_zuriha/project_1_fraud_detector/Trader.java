package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }
}
