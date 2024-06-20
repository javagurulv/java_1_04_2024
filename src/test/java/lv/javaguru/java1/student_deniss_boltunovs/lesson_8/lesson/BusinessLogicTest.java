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
        int english = logic.findBestMark("english");
        int math = logic.findBestMark("math");
        assertEquals(7,english);
        assertEquals(10,math);
    }

}