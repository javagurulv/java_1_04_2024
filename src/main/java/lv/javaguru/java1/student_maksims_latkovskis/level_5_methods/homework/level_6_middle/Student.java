package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_6_middle;

import java.util.ArrayList;
class Student {

    private String firstName;
    private String lastName;
    ArrayList <Integer> marksMathematics = new ArrayList<>();
    ArrayList <Integer> marksEnglish = new ArrayList<>();
    ArrayList <Integer> marksSports = new ArrayList<>();
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setMarksMathematics(int markMathematics){
        marksMathematics.add(markMathematics);
    }

    public void setMarksEnglish(int markEnglish){
        marksEnglish.add(markEnglish);
    }

    public void setMarksSports(int markSports){
        marksSports.add(markSports);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
