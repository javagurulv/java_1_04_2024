package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_1;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    BusinessLogic logic = new BusinessLogic();

    @Test
    void testListOfInteger(){
        logic.addNewNumber(5);
        logic.addNewNumber(4);
        logic.addNewNumber(11);
        logic.addNewNumber(8);

        int sum = logic.sumOfNumbers();
        int length = logic.getNumbers().getNumbers().size();

        assertEquals(28, sum);
        assertEquals(4, length);
    }

    @Test
    void testListOfDogs(){
        logic.addNewDog("lori", "brown",5);
        logic.addNewDog("borbos", "black",15);
        logic.addNewDog("berber", "white",2);
        logic.addNewDog("ala", "brown",9);

        List<Dog> allDogs = logic.allDogs();
        List<Dog> selectedDogs = logic.selectedDogs("brown");

        assertEquals(4, allDogs.size());
        assertEquals(2, selectedDogs.size());
    }

}