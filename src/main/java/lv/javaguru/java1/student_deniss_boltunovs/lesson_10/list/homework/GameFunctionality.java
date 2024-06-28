package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.list.homework;

class GameFunctionality {

    private WordBank wordBank;

    GameFunctionality(){
           this.wordBank = new WordBank();
    }

    public WordBank getWordBank() {
        return wordBank;
    }

    void addWord(String word) {
         Word newWord = new Word(word);
         wordBank.getWords().add(newWord)  ;
//          addNewWord(newWord);
    }

    void printWords(){
        System.out.println(wordBank.getWords());
    }

    int wordsCount(){
        return wordBank.getWords().size();
    }


}
