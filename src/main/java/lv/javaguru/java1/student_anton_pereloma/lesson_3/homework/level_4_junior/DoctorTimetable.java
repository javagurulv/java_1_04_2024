package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_4_junior;

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

    String getDoctorFirstName() {
        return this.firstName;
    }

    String getDoctorLastName() {
        return this.lastName;
    }

    String getDoctorSpecialization() {
        return this.specialization;
    }

    PatientVisit getVisitSlot1() {
        return this.visitSlot1;
    }

    PatientVisit getVisitSlot2() {
        return this.visitSlot2;
    }
}