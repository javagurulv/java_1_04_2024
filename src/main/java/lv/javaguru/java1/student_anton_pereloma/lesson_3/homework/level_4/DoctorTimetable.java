package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_4;

class DoctorTimetable {
    private String firstName;
    private String lastName;
    private String specialization;
    private PatientVisit visitSlot1;
    private PatientVisit visitSlot2;

    public DoctorTimetable(String firstName,
                           String lastName,
                           String specialization,
                           PatientVisit visitSlot1,
                           PatientVisit visitSlot2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.visitSlot1 = visitSlot1;
        this.visitSlot2 = visitSlot2;
    }

    public String getDoctorFirstName() {
        return this.firstName;
    }

    public String getDoctorLastName() {
        return this.lastName;
    }

    public String getDoctorSpecialization() {
        return this.specialization;
    }

    public PatientVisit getVisitSlot1() {
        return this.visitSlot1;
    }

    public PatientVisit getVisitSlot2() {
        return this.visitSlot2;
    }
}