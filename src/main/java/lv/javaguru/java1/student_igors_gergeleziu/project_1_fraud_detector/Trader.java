package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
        this.country="";
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
