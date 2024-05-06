package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_4_junior;

class Doctor {
    private String doctorName;
    private String specialty;
    private String data;
    private Patient morningVisit;
    private Patient afternoonVisit;

    public Doctor(String doctorName, String specialty, String data, Patient morningVisit, Patient afternoonVisit) {
        this.doctorName = doctorName;
        this.specialty = specialty;
        this.data = data;
        this.morningVisit = morningVisit;
        this.afternoonVisit = afternoonVisit;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public String getSpecialty(){
        return specialty;
    }
    public String getData(){
        return data;
    }
    public Patient getMorningVisit(){
        return morningVisit;
    }
    public Patient getAfternoonVisit(){
        return afternoonVisit;
    }



}
