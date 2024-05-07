package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

class StudentGrade {

    public String calculateGrade(int mark) {
        if ((mark >= 90) && (mark <= 100)) {
            return "A";
        } else if ((mark >= 80) && (mark <= 89)) {
            return "B";
        } else if ((mark >= 70) && (mark <= 79)) {
            return "C";
        } else if ((mark >= 60) && (mark <= 69)) {
            return "D";
        } else if ((mark >= 0) && (mark <= 59)) {
            return "F";
        } else {
            return "unknown grade";
        }
    }

}
