package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_4_junior;

class Patient {
    private String patientName;
    private String diagnosis;
    private double patientCost;

    public Patient(String patientName, String diagnosis, double patientCost) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.patientCost = patientCost;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public double getPatientCost(){
        return patientCost;
    }
}
