package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_4_junior;

class Appointment {

    private String patient;
    private String diagnosis;
    private double appointmentFee;

    public Appointment(String patient, String diagnosis, double appointmentFee){
       this.patient = patient;
       this.diagnosis = diagnosis;
       this.appointmentFee = appointmentFee;

    }

    public String getPatient(){
        return this.patient;
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }
    public double getAppointmentFee(){
        return this.appointmentFee;
    }

}
