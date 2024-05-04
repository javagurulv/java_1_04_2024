package lv.javaguru.java1.student_nadezda_radigina.lesson3.level4;

 class DoctorTimetableApplication {
     public static void main(String[] args){
         Patient patientOne = new Patient("Ivan Ivanov", "cough", 50);
         Patient patientTwo = new Patient("Petr Petrov", "runny nose", 40);
         Patient patientThree = new Patient("Valdis Lapsa ", "toothache", 100);
         Patient patientFour = new Patient("Arvis Lācis", "control visit", 60);
         Doctor doctor1 = new Doctor("Anda Ozola", "family doctor", "10.05.24.", patientOne,patientTwo);
         Doctor doctor2 = new Doctor("Ilze Saule", "dentist", "15.06.24.", patientThree, patientFour);



     }
}
