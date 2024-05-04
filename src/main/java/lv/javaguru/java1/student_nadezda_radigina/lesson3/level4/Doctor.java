package lv.javaguru.java1.student_nadezda_radigina.lesson3.level4;

 class Doctor {
     String doctorNameSurname;
     String speciality;
     String date;
     Patient time1;
     Patient time2;

     public Doctor(String doctorNameSurname, String speciality, String date, Patient time1, Patient time2){
         this.doctorNameSurname = doctorNameSurname;
         this.speciality = speciality;
         this.date = date;
         this.time1 = time1;
         this.time2 = time2;
     }
     public String getDoctorNameSurname(){
         return this.doctorNameSurname = doctorNameSurname;
     }
     public String getSpeciality(){
         return this.speciality = speciality;
     }
     public String getDate(){
         return this.date = date;
     }


}
