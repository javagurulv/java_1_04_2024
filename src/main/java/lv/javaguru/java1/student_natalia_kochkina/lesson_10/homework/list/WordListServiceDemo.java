package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.list;

class WordListServiceDemo {

    public static void main(String[] args) {
        WordListService words = new WordArrayListService();
        words.addWord("word1");
        words.addWord("word2");
        words.addWord("word3");

        System.out.println(words.containsWord("word1"));
        System.out.println(words.getSize());

        WordListService words2 = new WordLinkedListService();
        words2.addWord("word1");
        words2.addWord("word2");
        words2.addWord("word3");
        words2.removeWord(0);

        System.out.println(words2.getWord(1));
        System.out.println(words2.containsWord("word1"));
        System.out.println(words2.getSize());
    }

}
