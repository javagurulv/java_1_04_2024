package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_4_junior;

class DoctorDayVisitApp {
    DoctorAppointment doctorAppointment;

    public DoctorDayVisitApp(DoctorAppointment doctorAppointment) {
        this.doctorAppointment = doctorAppointment;
    }

    public void printAppointments()
    {
        System.out.println("Doctor: " + doctorAppointment.getDoctorName() + ", "
                + "Morning appointment: " + doctorAppointment.getAppointmentMorning().getPatient() + ", "
                + "Even app: " + doctorAppointment.getAppointmentEvening().getPatient());
    }
}
