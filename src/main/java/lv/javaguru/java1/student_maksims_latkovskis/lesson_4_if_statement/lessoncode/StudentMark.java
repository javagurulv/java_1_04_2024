package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your score 0-100:");
        int mark = scanner.nextInt();
        String grade;

        while((mark<0) || (mark>100)) {
            System.out.println("Enter real score you cheater:");
            mark = scanner.nextInt();
        }

            if(mark>89) {
                grade = "A";
            }
            else if(mark>79) {
                 grade = "B";
            }
            else if(mark>69) {
                grade = "C";
            }
             else if(mark>69) {
                grade = "D";
            }
            else{
                grade = "F";
            }

        System.out.println("Your grade is: " + grade);
    }
}
