package lv.javaguru.java1.student_nadezda_radigina.lesson3.level4;

 class DoctorDayVisitApplication {

     public static void main(String[] args) {
         Patient patientOne = new Patient("Ivan Ivanov", "cough", 50);
         Patient patientTwo = new Patient("Petr Petrov", "runny nose", 40);
         Patient patientThree = new Patient("Valdis Lapsa ", "toothache", 100);
         Patient patientFour = new Patient("Arvis Lācis", "control visit", 60);
         Doctor doctor1 = new Doctor("Anda Ozola", "family doctor", "10.05.24.", patientOne,patientTwo);
         Doctor doctor2 = new Doctor("Ilze Saule", "dentist", "15.06.24.", patientThree, patientFour);

         System.out.println("Doctor: " + doctor1.getDoctorNameSurname());
         System.out.println("Speciality: " + doctor1.getSpeciality());
         System.out.println("Visit date: " + doctor1.getDate());
         System.out.println("Patient1: " + doctor1.time1.getPatientNameSurname() + "," + doctor1.time1.getDiagnosis() + ", price " + doctor1.time1.getPrice());
         System.out.println("Patient2: " + doctor1.time2.getPatientNameSurname() + "," + doctor1.time2.getDiagnosis() + ", price " + doctor1.time2.getPrice());
         System.out.println();

         System.out.println("Doctor: " + doctor2.getDoctorNameSurname());
         System.out.println("Speciality: " + doctor2.getSpeciality());
         System.out.println("Visit date: " + doctor2.getDate());
         System.out.println("Patient1: " + doctor2.time1.getPatientNameSurname() + "," + doctor2.time1.getDiagnosis() + ", price " + doctor2.time1.getPrice());
         System.out.println("Patient2: " + doctor2.time2.getPatientNameSurname() + "," + doctor2.time2.getDiagnosis() + ", price " + doctor2.time2.getPrice());
         System.out.println();

     }
 }