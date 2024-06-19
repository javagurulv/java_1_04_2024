package lv.javaguru.java1.teacher.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;

class BusinessLogicTest {

    public static void main(String[] args) {
        BusinessLogicTest test = new BusinessLogicTest();
        test.findBestMarkEng();
    }

    public void findBestMarkEng() {
        BusinessLogic bl = new BusinessLogic();
        bl.addMark("Eng", 6);
        bl.addMark("Eng", 7);
        bl.addMark("Math", 10);
        int bestMark = bl.findBestMark("Eng");
        if (bestMark == 7) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

}
