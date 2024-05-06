package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_4;

import java.util.Date;

class Doctor {

    private String doctorName;
    private String doctorType;
    private Date date;
    private Appointment appointment1;
    private Appointment appointment2;


    public Doctor(String doctorName, String doctorType, Date date, Appointment appointment1, Appointment appointment2) {

        this.doctorName = doctorName;
        this.doctorType = doctorType;
        this.date = date;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;

    }

    public String getDoctorName() {
        return this.doctorName;

    }

    public String getDoctorType() {
        return this.doctorType;

    }

    public Date getDate() {
        return this.date;

    }

    public Appointment getAppointment1() {
        return this.appointment1;
    }

    public Appointment getAppointment2() {
        return this.appointment2;

    }

}
