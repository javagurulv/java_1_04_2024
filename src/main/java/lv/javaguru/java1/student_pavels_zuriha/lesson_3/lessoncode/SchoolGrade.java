package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

class SchoolGrade {

    private String studentFirstName;
    private String studentLastName;
    private String study;
    private int grade;

    public SchoolGrade(String studentFirstName, String studentLastName, String study, int grade) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.study = study;
        this.grade = grade;

    }

    String getStudentFirstName() {
        return this.studentFirstName;

    }

    String getStudentLastName() {
        return this.studentLastName;

    }

    String getStudy() {
        return this.study;

    }

    int getGrade() {
        return this.grade;

    }

}

class SchoolGradeApp {

    public static void main(String[] args) {

        SchoolGrade student1 = new SchoolGrade("Vasja", "Pupkin", "Math", 10);
        SchoolGrade student2 = new SchoolGrade("NeVasja", "NePupkin", "NeMath", 1);


        System.out.println("First student: " + student1.getStudentFirstName() + " " + student1.getStudentLastName() + " " + student1.getStudy() + " " + student1.getGrade());
        System.out.println("Second student: " + student2.getStudentFirstName() + " " + student2.getStudentLastName() + " " + student2.getStudy() + " " + student2.getGrade());
    }
}