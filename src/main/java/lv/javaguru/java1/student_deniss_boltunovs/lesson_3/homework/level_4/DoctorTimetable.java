package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_4;

import java.util.Date;

class DoctorTimetable {

      private String fullName;
      private String specialties;
      private Date appointmentDate;
      private Patient appointment1;
      private Patient appointment2;

      public DoctorTimetable(String fullName,
                             String specialties,
                             Date appointmentDate,
                             Patient appointment1,
                             Patient appointment2) {

             this.fullName = fullName;
             this.specialties = specialties;
             this.appointmentDate = appointmentDate;
             this.appointment1 = appointment1;
             this.appointment2 = appointment2;
      }

      public String getFullName() {return this.fullName;}

      public String getSpecialties() {return this.specialties;}

      public Date getAppointmentDate() {return this.appointmentDate;}

      public Patient getAppointment1() {return this.appointment1;}

      public Patient getAppointment2() {return this.appointment2;}

}
