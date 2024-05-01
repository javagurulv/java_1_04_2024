package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_4;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {
        Appointment appointment1 = new Appointment("Ivan", "Ivanov",
                "flu", 50);
        Appointment appointment2 = new Appointment("Galina", "Petrova",
                "tonsillitis", 50);
        Date appointmentDate1 = new Date(124, 05, 03);
        DoctorTimetable doctorTimetable1 = new DoctorTimetable("Michael", "Jackson",
                "psychiatrist", appointmentDate1, appointment1, appointment2);

        Appointment appointment3 = new Appointment("Piter", "Petrov",
                "broken leg", 60);
        Appointment appointment4 = new Appointment("Sandra", "Sidorova",
                "concussion of the brain", 40);
        Date appointmentDate2 = new Date(124, 05, 04);
        DoctorTimetable doctorTimetable2 = new DoctorTimetable("Zigmund", "Freid",
                "traumatologist", appointmentDate2, appointment3, appointment4);

        System.out.println("Doktor1 name = " + doctorTimetable1.getDoctorName());
        System.out.println("Doktor1 surname = " + doctorTimetable1.getDoctorSurname());
        System.out.println("Doktor1 speciality = " + doctorTimetable1.getSpeciality());
        System.out.println("Date1 = " + doctorTimetable1.getAppointmentDate());
        System.out.println("Patient1 name = " + doctorTimetable1.getAppointment1().getPatientName());
        System.out.println("Patient1 surname = " + doctorTimetable1.getAppointment1().getPatientSurname());
        System.out.println("Patient1 diagnoctic = " + doctorTimetable1.getAppointment1().getDiagnostic());
        System.out.println("Patient1 price = " + doctorTimetable1.getAppointment1().getPrice());
    }
}
