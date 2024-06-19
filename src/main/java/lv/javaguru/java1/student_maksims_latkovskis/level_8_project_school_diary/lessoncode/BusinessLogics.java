package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.lessoncode;

import lv.javaguru.java1.student_eyheni_salmin.lesson_2.class_work.IntegerCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BusinessLogics {

    private Diary diary;

    public  BusinessLogics() {
        this.diary = new Diary();
    }

    public static void main(String[] args){
        BusinessLogics bl = new BusinessLogics();
        bl.addMark("Eng", 4);
        bl.addMark("Eng", 5);
        bl.addMark("Eng", 6);

        int best = bl.maxMarkPerCourse("Eng");
        if(best == 6 ) System.out.println("Ok");
    }





    public void addMark(String course, int mark){
        CourseMark newMark = new CourseMark(course, mark);
        diary.addMark(newMark);
    }

    public List<CourseMark> findMarksBySubject(String subject){

        List<CourseMark> sortedMarks = new ArrayList<>();
        for(CourseMark courseMark: diary.getMarks()){
            if(courseMark.getCourseName().equals(subject)){
                sortedMarks.add(courseMark);
            }
        }
        return sortedMarks;
    }

    public int findBestMark(String subject){
        List <CourseMark> sortedMarks = findMarksBySubject(subject);
        int bestMark = sortedMarks.get(0).getMark();
        for(CourseMark mark: sortedMarks){
            if(mark.getMark()>bestMark) bestMark = mark.getMark();
        }
        return bestMark;
    }

    int maxMarkPerCourse(String courseName){

        return diary.getMarks().stream()
                .filter(course -> course.getCourseName().equals(courseName))
                .map(mark -> mark.getMark())
                .max(Integer::compareTo)
                .orElseGet(()->0);


    }

}