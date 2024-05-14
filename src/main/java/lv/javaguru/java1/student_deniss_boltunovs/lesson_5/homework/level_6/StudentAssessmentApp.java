package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_6;

class StudentAssessmentApp {

    public static void main(String[] args) {

        StudentAssessment assessment1 = new StudentAssessment("John",
                                                           "Dow",
                                                            new String[]{"Math", "Sport", "Art", "English"},
                                                            new int[]{7, 9, 6, 8} );

        StudentAssessment assessment2 = new StudentAssessment("Michael",
                                                            "Brown",
                                                            new String[]{"Spanish", "Economics", "History"},
                                                            new int[]{6, 4, 8} );

        System.out.println("1.Student");
        System.out.println("   Name: " + assessment1.getStudentName());
        System.out.println("   Surname: "+ assessment1.getStudentSurname());
        System.out.println("   Average mark: " + assessment1.averageMark());

        System.out.println(" ");

        System.out.println("2.Student");
        System.out.println("   Name: " + assessment2.getStudentName());
        System.out.println("   Surname: "+ assessment2.getStudentSurname());
        System.out.println("   Average mark: " + assessment2.averageMark());

    }
}
