package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.list.homework;

import java.util.ArrayList;
import java.util.List;

class WordBank {

     private List<Word> words;

     WordBank() {
         this.words = new ArrayList<>();
     }

     List<Word> getWords(){
         return words;
     }

     void addNewWord(Word word) {
         this.words.add(word);
     }


}
