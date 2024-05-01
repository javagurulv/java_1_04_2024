package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_4;

import java.util.Date;

class DoctorTimetable {

private String doctorName;
private String doctorSurname;
private String speciality;
private Date appointmentDate;
private Appointment appointment1;
private Appointment appointment2;

    public DoctorTimetable(String doctorName, String doctorSurname, String speciality,
                           Date appointmentDate, Appointment appointment1, Appointment appointment2) {
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.speciality = speciality;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDoctorName() {
        return this.doctorName;
    }

    public String getDoctorSurname() {
        return this.doctorSurname;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public Date getAppointmentDate() {
        return this.appointmentDate;
    }

    public Appointment getAppointment1() {
        return this.appointment1;
    }

    public Appointment getAppointment2() {
        return this.appointment2;
    }
}
