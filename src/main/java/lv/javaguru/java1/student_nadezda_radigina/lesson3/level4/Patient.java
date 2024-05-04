package lv.javaguru.java1.student_nadezda_radigina.lesson3.level4;

 class Patient {
     String patientNameSurname;
     String diagnosis;
     int price;
     public Patient(String patientNameSurname,  String diagnosis, int price){
         this.patientNameSurname = patientNameSurname;
         this.diagnosis = diagnosis;
         this.price = price;
     }
     public String getPatientNameSurname(){
         return this.patientNameSurname = patientNameSurname;
     }
     public String getDiagnosis(){
         return this.diagnosis = diagnosis;
     }
     public int getPrice(){
         return this.price = price;
     }
}
