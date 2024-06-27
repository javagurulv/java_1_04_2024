package lv.javaguru.java1.student_natalia_kochkina.lesson_8.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    BusinessLogic bl = new BusinessLogic();

    @Test
    void findBestMarkBySubject() {
        bl.addMark("Math", 5);
        bl.addMark("English", 7);
        bl.addMark("Math", 10);
        bl.addMark("Biology", 6);
        assertEquals(bl.findBestMarkBySubject("Math"), 10);
    }

    @Test
    void findWorstMarkBySubject() {
        bl.addMark("Math", 5);
        bl.addMark("English", 7);
        bl.addMark("Math", 10);
        bl.addMark("Biology", 6);
        assertEquals(bl.findWorstMarkBySubject("Math"), 5);
    }

    @Test
    void findAverageMarkBySubject() {
        bl.addMark("Math", 5);
        bl.addMark("English", 7);
        bl.addMark("Math", 10);
        bl.addMark("Biology", 6);
        assertEquals(bl.findAverageMarkBySubject("Math"), 7.5, 0.01);
    }

    @Test
    void findAverageMarkByAllSubjects() {
        bl.addMark("Math", 5);
        bl.addMark("English", 7);
        bl.addMark("Math", 10);
        bl.addMark("Biology", 6);
        assertEquals(bl.findAverageMarkByAllSubjects(), 7);
    }

}