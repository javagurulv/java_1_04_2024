package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_4;

class PatientVisit {
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int visitCharge;
    private String visitTime;

    public PatientVisit(String firstName,
                        String lastName,
                        String diagnosis,
                        int visitCharge,
                        String visitTime) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.visitCharge = visitCharge;
        this.visitTime = visitTime;


    }
    public String getPatientFirstName() {
        return this.firstName;
    }

    public String getPatientLastName() {
        return this.lastName;
    }

    public String getPatientDiagnosis() {
        return this.diagnosis;
    }

    public int getPatientVisitCharge() {
        return this.visitCharge;
    }

    public String getPatientVisitTime() {
        return this.visitTime;
    }


}
