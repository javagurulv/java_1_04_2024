package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class StudentApplication {

    public static void main(String[] args) {

        Student student1 = new Student("Den", "Bol","English",8);
        Student student2 = new Student("John", "Dow","Economics",10);

        // Information regarding student 1
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Surname: " + student1.getSurname());
        System.out.println("Student 1 subject: " + student1.getSubject());
        System.out.println("Student 1 grade: " + student1.getGrade());

        // Information regarding student 2
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Surname: " + student2.getSurname());
        System.out.println("Student 2 subject: " + student2.getSubject());
        System.out.println("Student 2 grade: " + student2.getGrade());

    }

}
