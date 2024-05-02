package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_4;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {


        Appointment appointment1 = new Appointment("Patient 1", "Diagnosis1", 100);
        Appointment appointment2 = new Appointment("Patient 2", "Diagnosis2", 200);
        Doctor doctor1 = new Doctor("Vasya Pupkin", "Therapist", new Date("12/12/12"), appointment1, appointment2);


        System.out.println("Doctor Name: " + doctor1.getDoctorName());
        System.out.println("Doctor Type: " + doctor1.getDoctorType());
        System.out.println("Appointment Date: " + doctor1.getDate());
        System.out.println("Patient name of First Appointment: " + doctor1.getAppointment1().getPatientName());
        System.out.println("Patient Diagnosis: " + doctor1.getAppointment1().getDiagnosis());
        System.out.println("Price: " + doctor1.getAppointment1().getPrice());
        System.out.println("Patient name of Second Appointment: " + doctor1.getAppointment2().getPatientName());
        System.out.println("Patient Diagnosis: " + doctor1.getAppointment2().getDiagnosis());
        System.out.println("Price: " + doctor1.getAppointment2().getPrice());


    }


}
