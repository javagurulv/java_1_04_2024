package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.lesson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    BusinessLogic logic = new BusinessLogic();

    @Test
    void findMaxMarkBySubject(){
        logic.addNewMark("english", 5);
        logic.addNewMark("english", 7);
        logic.addNewMark("math", 10);
        logic.addNewMark("math", 8);
        int english = logic.findMaxMark("english");
        int math = logic.findMaxMark("math");
        assertEquals(7,english);
        assertEquals(10,math);
    }

    @Test
    void findMinMarkBySubject(){
        logic.addNewMark("english", 5);
        logic.addNewMark("english", 7);
        logic.addNewMark("math", 10);
        logic.addNewMark("math", 8);
        int english = logic.findMinMark("english");
        int math = logic.findMinMark("math");
        assertEquals(5,english);
        assertEquals(8,math);
    }

    @Test
    void findAverageMarkBySubject(){
        logic.addNewMark("english", 6);
        logic.addNewMark("english", 7);
        logic.addNewMark("english", 9);
        logic.addNewMark("math", 10);
        logic.addNewMark("math", 8);
        logic.addNewMark("math", 5);
        double english = logic.findAverageMark("english");
        double math = logic.findAverageMark( "math");
        assertEquals(7.33,english, 0.01);
        assertEquals(7.66,math,0.01);
    }

    @Test
    void findAverageMarkAcrossAllSubjects(){
        logic.addNewMark("english", 6);
        logic.addNewMark("english", 9);
        logic.addNewMark("math", 8);
        logic.addNewMark("math", 5);
        logic.addNewMark("math", 4);
        double averageMark = logic.findTotalAverageMark();
        assertEquals(6.4,averageMark, 0.01);
    }

}