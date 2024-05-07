package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

public class StudentGradeTest {

    public static void main(String[] args){
        StudentGradeTest test = new StudentGradeTest();
        test.test1();
        test.test2();
    }


    public void test1(){
        int mark = 100;
        String expectedGrade = "A";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculatedMark(mark);

        if(realGrade == expectedGrade)
        {System.out.println("OK");}
    }

    public void test2(){
        int mark = 14;
        String expectedGrade = "F";

        StudentGrade studentGrade = new StudentGrade();
        String realGrade = studentGrade.calculatedMark(mark);

        if(realGrade == expectedGrade)
        {System.out.println("OK");}
    }






}
