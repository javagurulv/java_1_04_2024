package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_4_junior;

public class ReceptionRec {
    private String patientName;
    private String patientSurName;
    private String diagnosis;
    private double price;

    public ReceptionRec(String patientName, String patientSurName, String diagnosis, double price) {
        this.patientName = patientName;
        this.patientSurName = patientSurName;
        this.diagnosis = diagnosis;
        this.price = price;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurName() {
        return patientSurName;
    }

    public void setPatientSurName(String patientSurName) {
        this.patientSurName = patientSurName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printDocShed() {
        System.out.println(getPatientName() + " " + getPatientSurName() + " " + "\n" +
                getDiagnosis() + "\n" + getPrice());
    }

}
