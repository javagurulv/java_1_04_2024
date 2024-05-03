package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_4;

public class DoctorTimetableApp {
    public static void main(String[] args) {
      DoctorTimetable doctor1 = new DoctorTimetable(
              "Gregory",
              "House",
              "Infectious Disease Specialist",
              new PatientVisit(
                      "John",
                      "Doe",
                      "Volchanka",
                      50000,
                      "10:00 - 12:00"),
              new PatientVisit(
                      "Jane",
                      "Doe",
                      "Streptokok",
                      150500,
                      "14:00 - 16:00"
              )
      );
      System.out.println("*******************************************************");
      System.out.println(
              "Doctor: "
                    + doctor1.getDoctorFirstName() + " "
                    + doctor1.getDoctorLastName() + "\n"
                    + doctor1.getDoctorSpecialization()
      );
      System.out.println("*******************************************************");
      System.out.println(
              "Patient: "
                      + doctor1.getVisitSlot1().getPatientFirstName() + " "
                      + doctor1.getVisitSlot1().getPatientLastName() + "\n"
                      + "Diagnosis: "+ doctor1.getVisitSlot1().getPatientDiagnosis() + "\n"
                      + "Visit time: "+ doctor1.getVisitSlot1().getPatientVisitTime() + "\n"
                      + "Visit charge: " + doctor1.getVisitSlot1().getPatientVisitCharge() + "$"
      );
      System.out.println("*******************************************************");
      System.out.println(
              "Doctor: "
                    + doctor1.getDoctorFirstName() + " "
                    + doctor1.getDoctorLastName() + "\n"
                    + doctor1.getDoctorSpecialization()
      );
      System.out.println("*******************************************************");
      System.out.println(
              "Patient: "
                      + doctor1.getVisitSlot2().getPatientFirstName() + " "
                      + doctor1.getVisitSlot2().getPatientLastName() + "\n"
                      + "Diagnosis: "+ doctor1.getVisitSlot2().getPatientDiagnosis() + "\n"
                      + "Visit time: "+ doctor1.getVisitSlot2().getPatientVisitTime() + "\n"
                      + "Visit charge: " + doctor1.getVisitSlot2().getPatientVisitCharge() + "$"
      );
    }
}
