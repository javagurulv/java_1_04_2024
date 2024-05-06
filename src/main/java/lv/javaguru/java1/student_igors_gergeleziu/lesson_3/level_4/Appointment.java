package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_4;

class Appointment {
    private String patientName;
    private String patientSurname;
    private String diagnosis;
    private int appointmentPrice;

    Appointment(String patientName, String patientSurname, String diagnosis, int appointmentPrice) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.diagnosis = diagnosis;
        this.appointmentPrice = appointmentPrice;
    }

    String getPatientName() {
        return patientName;
    }

    String getPatientSurname() {
        return patientSurname;
    }

    String getDiagnosis() {
        return diagnosis;
    }

    int getAppointmentPrice() {
        return appointmentPrice;
    }
}
