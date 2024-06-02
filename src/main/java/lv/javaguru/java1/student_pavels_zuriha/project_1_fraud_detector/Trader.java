package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }
}
