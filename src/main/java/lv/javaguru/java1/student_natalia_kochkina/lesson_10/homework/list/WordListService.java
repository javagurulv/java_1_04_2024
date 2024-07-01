package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.list;

interface WordListService {

    void addWord(String word);

    int getSize();

    String getWord(int index);

    void removeWord(int index);

    boolean containsWord(String word);

}
