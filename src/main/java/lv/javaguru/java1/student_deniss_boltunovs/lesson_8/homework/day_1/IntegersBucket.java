package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class IntegersBucket {

     private List<Integer> numbers;

     IntegersBucket(){
         this.numbers = new ArrayList<>();
     }

     List<Integer> getNumbers(){
         return this.numbers;
     }

     void addNumber(int number){
         this.numbers.add(number);
     }

}
