package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_6.solution_1;

class StudentAssessment {

     private String studentName;
     private String studentSurname;
     private String[] subjects;
     private int[] marks;

     public StudentAssessment(String studentName,
                              String studentSurname,
                              String[] subjects,
                              int[] marks) {

         this.studentName = studentName;
         this.studentSurname = studentSurname;
         this.subjects = subjects;
         this.marks = marks;
     }

    public String getStudentName() {
         return this.studentName;
    }

    public String getStudentSurname() {
        return this.studentSurname;
    }

    public double averageMark() {
         int[] markArray = this.marks;
         int markCount = this.marks.length;
         int markSum = 0;

         for (int i = 0; i < markCount; i++) {
            markSum += markArray[i] ;
         }

         return (double) markSum / markCount;
    }

}
