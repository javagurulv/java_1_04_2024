package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class Trader {

    private String fullName;
    private String city;

    public Trader(String fullName, String city){
        this.city = city;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
