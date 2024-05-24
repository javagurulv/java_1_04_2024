package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_6.solution_2;

class AssessmentApp {

    public static void main(String[] args) {

        CalculateAverageMark averageMark = new CalculateAverageMark();

        Subjects subjects1 = new Subjects(5, 7, 8, 9, 10);
        Subjects subjects2 = new Subjects(10, 10, 7, 6, 3);

        System.out.println("Student 1");
        System.out.println("   Average mark: " + averageMark.calculate(subjects1));

        System.out.println(" ");

        System.out.println("Student 2");
        System.out.println("   Average mark: " + averageMark.calculate(subjects2));

    }
}
