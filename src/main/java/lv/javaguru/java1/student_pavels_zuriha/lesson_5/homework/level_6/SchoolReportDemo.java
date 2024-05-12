package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_6;

class SchoolReportDemo {

    public static void main(String[] args) {

        SchoolReport schoolReport = new SchoolReport("Vasya Pupkin", 7, 9, 6, 7, 3, 10);
        SchoolReport schoolReport1 = new SchoolReport("John Doe", 9, 9, 8, 10, 6, 10);

        System.out.println("Name of the Student: " + schoolReport.getStudentName());
        System.out.println("Grade of the Student: " + schoolReport.getStudentGrade());
        System.out.println("Average Score: " + schoolReport.averageScore(schoolReport));

        System.out.println("Name of the Student: " + schoolReport1.getStudentName());
        System.out.println("Grade of the Student: " + schoolReport1.getStudentGrade());
        System.out.println("Average Score: " + schoolReport1.averageScore(schoolReport1));

    }

}
