package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_4_junior;

class DoctorDayVisitApp {
    public static void main(String[] args) {

        Patient morningVisit = new Patient("Anna Pupkin", "cold1", 20.00);
        Patient afternoonVisit = new Patient("Lena Vike", "cold2", 25.00);

        Doctor record1 = new Doctor("Antot Antonovic", "Family doctor", "2024-05-06", morningVisit, afternoonVisit);

        System.out.println("Doctor: " + record1.getDoctorName());
        System.out.println("Specialty: " + record1.getSpecialty());
        System.out.println("Morning (10:00-12:00): " + record1.getMorningVisit().getPatientName() + ", Diagnosis: " + record1.getMorningVisit().getDiagnosis() + ", Cost: " + record1.getMorningVisit().getPatientCost());
        System.out.println("Afternoon (14:00-16:00): " + record1.getAfternoonVisit().getPatientName() + ", Diagnosis: " + record1.getAfternoonVisit().getDiagnosis() + ", Cost: " + record1.getAfternoonVisit().getPatientCost());
    }
}
