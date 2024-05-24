package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_6_middle;

class ReportCardDemo {
    public static void main(String[] args) {

        ReportCard student1 = new ReportCard("Ivan", "Ivanov",8,7, 8,7);
        CalculateGradeAverage student1Grades = new CalculateGradeAverage(student1);
        System.out.println("Student Name: " + student1.getFullName());
        System.out.println("Student's Grade Average: " + student1Grades.findGradeAverage());
        System.out.println("*************************************************************");

        ReportCard student2 = new ReportCard("Petr", "Petrov",4,4, 5,4);
        CalculateGradeAverage student2Grades = new CalculateGradeAverage(student2);
        System.out.println("Student Name: " + student2.getFullName());
        System.out.println("Student's Grade Average: " + student2Grades.findGradeAverage());
        System.out.println("*************************************************************");

        ReportCard student3 = new ReportCard("Aleksandra", "Aleksandrova",10,10, 10,10);
        CalculateGradeAverage student3Grades = new CalculateGradeAverage(student3);
        System.out.println("Student Name: " + student3.getFullName());
        System.out.println("Student's Grade Average: " + student3Grades.findGradeAverage());
        System.out.println("*************************************************************");

    }
}
