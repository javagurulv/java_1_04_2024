package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_4_junior;

class DoctorAppointment {

    private String doctorName;
    private String doctorSpeciality;
    private String appointmentDate;
    private Appointment appointmentMorning;
    private Appointment appointmentEvening;

    public DoctorAppointment(String doctorName, String doctorSpeciality, String appointmentDate, Appointment appointmentMorning, Appointment appointmentEvening){

        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.appointmentDate = appointmentDate;
        this.appointmentMorning = appointmentMorning;
        this.appointmentEvening = appointmentEvening;
    }

    public String getDoctorName(){
        return this.doctorName;
    }

    public String getDoctorSpeciality(){
        return this.doctorSpeciality;
    }

    public String getAppointmentDate(){
        return this.appointmentDate;
    }

    public Appointment getAppointmentMorning(){
        return this.appointmentMorning;
    }

    public Appointment getAppointmentEvening(){
        return this.appointmentEvening;
    }

}
