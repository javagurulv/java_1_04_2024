package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_4_junior;

import javax.print.Doc;

public class DoctorTimetableApp {

    public static void main(String[] args){

        Appointment appointmentMorning = new Appointment("Bob Ross", "Insomnia", 50);
        Appointment appointmentEvening = new Appointment("Juan Basio", "Panic Attacks", 60);
        DoctorAppointment JohnK0805 = new DoctorAppointment("John Kelly","Neurology", "08.05.2024",appointmentMorning, appointmentEvening);

        appointmentMorning = new Appointment("Fedot Strelcov", "CavityTreatment", 120);
        appointmentEvening = new Appointment("Alexandra Rossi", "Hygienic cleaning", 60);
        DoctorAppointment RichardL0905 = new DoctorAppointment("Richard Lloyd","Dentist", "09.05.2024",appointmentMorning, appointmentEvening);

      //  DoctorDayVisitApp dayVisitApp = new DoctorDayVisitApp();
      //  dayVisitApp.main(JohnK0805, RichardL0905);

    }

}
