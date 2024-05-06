package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_4;

class DoctorTimetable {
    private String doctorName;
    private String doctorSurname;
    private String speciality;
    private String dateOfAppointment;
    private Appointment apFrom10To12Am;
    private Appointment apFrom14To16Pm;

    DoctorTimetable(String doctorName, String doctorSurname, String speciality, String dateOfAppointment, Appointment apFrom10To12Am, Appointment apFrom14To16Pm) {
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.speciality = speciality;
        this.dateOfAppointment = dateOfAppointment;
        this.apFrom10To12Am = apFrom10To12Am;
        this.apFrom14To16Pm = apFrom14To16Pm;
    }

    String getDoctorName() {
        return doctorName;
    }

    String getDoctorSurname() {
        return doctorSurname;
    }

    String getSpeciality() {
        return speciality;
    }

    String getDateOfAppointment() {
        return dateOfAppointment;
    }

    Appointment getApFrom10To12Am() {
        return apFrom10To12Am;
    }

    Appointment getApFrom14To16Pm() {
        return apFrom14To16Pm;
    }
}
