package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_6;

class ReportCardDemo {
    public static void main(String[] args) {
        ReportCard student1 = new ReportCard("Jake", "Smith");
        System.out.println("Student 1:");
        student1.setMarks();
        ReportCard student2 = new ReportCard("Anna", "Roland");
        System.out.println("Student 2: ");
        student2.setMarks();
        System.out.println(student1.toString());
        System.out.println("Final average mark Student1: " + student1.getFinalAverageMark(student1));
        System.out.println();
        System.out.println(student2.toString());
        System.out.println("Final average mark Student2: " + student2.getFinalAverageMark(student2));
    }
}
