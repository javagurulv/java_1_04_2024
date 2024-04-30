package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_4;

class DoctorTimetableApp {
    public static void main(String[] args) {
        DoctorTimetableApp doctorTimetableApp = new DoctorTimetableApp();
        DoctorTimetable appointment1 = new DoctorTimetable("Janis", "Zigurs", "Cardiologist", "12.05.2024",
                new Appointment("Arnis", "Lase", "Arhythmia", 120),
                new Appointment("Liene", "Cakste", "Unstable angina", 100));
        DoctorTimetable appointment2 = new DoctorTimetable("Zigmunds", "Freids", "Neurologist", "25.05.2024",
                new Appointment("Linda", "Berze", "Migraine", 70),
                new Appointment("Eriks", "Durbe", "diabetic neuropathy", 150));
        doctorTimetableApp.printInfo(appointment1);
        doctorTimetableApp.printInfo(appointment2);

    }

    void printInfo(DoctorTimetable doctorTimetable) {
        System.out.println("Doctor: " + doctorTimetable.getDoctorName() + " " + doctorTimetable.getDoctorSurname());
        System.out.println("Speciality: " + doctorTimetable.getSpeciality());
        System.out.println("Date of appointment: " + doctorTimetable.getDateOfAppointment());
        System.out.println("Appointment 10-12am: ");
        System.out.println("Patient: " + doctorTimetable.getApFrom10To12Am().getPatientName() + " " + doctorTimetable.getApFrom10To12Am().getPatientSurname());
        System.out.println("Diagnosis: " + doctorTimetable.getApFrom10To12Am().getDiagnosis());
        System.out.println("Price: " + doctorTimetable.getApFrom10To12Am().getAppointmentPrice() + "$");
        System.out.println("Appointment 14-16pm: ");
        System.out.println("Patient: " + doctorTimetable.getApFrom14To16Pm().getPatientName() + " " + doctorTimetable.getApFrom14To16Pm().getPatientSurname());
        System.out.println("Diagnosis: " + doctorTimetable.getApFrom14To16Pm().getDiagnosis());
        System.out.println("Price: " + doctorTimetable.getApFrom14To16Pm().getAppointmentPrice() + "$");
        System.out.println();
    }
}
