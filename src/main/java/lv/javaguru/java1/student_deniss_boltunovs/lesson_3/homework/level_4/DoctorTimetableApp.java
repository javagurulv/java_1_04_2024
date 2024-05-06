package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_4;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {

             ///// Timetable 1
             Patient appointment1 = new Patient("Random Name", "happy person", 100);
             Patient appointment2 = new Patient("Bob Angel", "smiling face", 50);

             DoctorTimetable timetable1 = new DoctorTimetable("Best Doctor", "happines",
                                                           new Date("01/01/2024"),
                                                           appointment1, appointment2);

             System.out.println("date: " + timetable1.getAppointmentDate());
             System.out.println("  doctor: " + timetable1.getFullName());
             System.out.println("  specialties: " + timetable1.getSpecialties());
             System.out.println("  Appointment 1");
             System.out.println("    full name: " + timetable1.getAppointment1().getFullName());
             System.out.println("    diagnosis: " + timetable1.getAppointment1().getDiagnosis());
             System.out.println("    price for visit: " + timetable1.getAppointment1().getPrice());
             System.out.println("  Appointment 2");
             System.out.println("    full name: " + timetable1.getAppointment2().getFullName());
             System.out.println("    diagnosis: " + timetable1.getAppointment2().getDiagnosis());
             System.out.println("    price for visit: " + timetable1.getAppointment2().getPrice());


             ///// Timetable 2
             appointment1 = new Patient("Katy Wood", "rich", 15);
             appointment2 = new Patient("Jimmy Brown", "headache", 24);

             DoctorTimetable timetable2 = new DoctorTimetable( "Another Doctor", "dentist",
                                                            new Date("02/15/2024"),
                                                            appointment1, appointment2);

            System.out.println(" ");
            System.out.println("date: " + timetable2.getAppointmentDate());
            System.out.println("  doctor: " + timetable2.getFullName());
            System.out.println("  specialties: " + timetable2.getSpecialties());
            System.out.println("  Appointment 1");
            System.out.println("    full name: " + timetable2.getAppointment1().getFullName());
            System.out.println("    diagnosis: " + timetable2.getAppointment1().getDiagnosis());
            System.out.println("    price for visit: " + timetable2.getAppointment1().getPrice());
            System.out.println("  Appointment 2");
            System.out.println("    full name: " + timetable2.getAppointment2().getFullName());
            System.out.println("    diagnosis: " + timetable2.getAppointment2().getDiagnosis());
            System.out.println("    price for visit: " + timetable2.getAppointment2().getPrice());

    }
}
