package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.list.homework;

class PlayGame {

    public static void main(String[] args) {
         GameFunctionality game = new GameFunctionality() ;

         game.addWord("Name");
         game.addWord("age");
         game.addWord("Nine");
         game.addWord("dog");


         game.printWords();
         System.out.println("Count of words: " + game.wordsCount());
    }

}
