package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_4_junior;

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

    String getPatientFirstName() {
        return this.firstName;
    }

    String getPatientLastName() {
        return this.lastName;
    }

    String getPatientDiagnosis() {
        return this.diagnosis;
    }

    int getPatientVisitCharge() {
        return this.visitCharge;
    }

    String getPatientVisitTime() {
        return this.visitTime;
    }
}
