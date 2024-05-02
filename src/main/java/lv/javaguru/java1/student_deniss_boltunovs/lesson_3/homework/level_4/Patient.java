package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_4;

class Patient {

      private String fullName;
      private String diagnosis;
      private int priceForVisit;

      public Patient(String fullName, String diagnosis, int priceForVisit) {
          this.fullName = fullName;
          this.diagnosis = diagnosis;
          this.priceForVisit = priceForVisit;
      }

      public String getFullName() {return this.fullName;}

      public String getDiagnosis() {return this.diagnosis;}

      public int getPrice() {return this.priceForVisit;}

}
