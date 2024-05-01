package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class Student {

      private String name;
      private String surname;
      private String subject;
      private int grade;

      public Student(String name, String surname, String subject, int grade) {
          this.name = name;
          this.surname = surname;
          this.subject = subject;
          this.grade = grade;
      }

      public String getName() {
          return this.name;
      }

      public String getSurname() {
          return this.surname;
      }

      public String getSubject() {
          return this.subject;
      }

      public int getGrade() {
        return this.grade;
      }
}
