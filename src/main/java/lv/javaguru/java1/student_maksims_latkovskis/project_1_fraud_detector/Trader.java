package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country){
        this.city = city;
        this.fullName = fullName;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() { return  country; }
}
