package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.list;

class WordListService {

    private WordList words;

    public WordListService() {
        this.words = new WordList();
    }

    public void addWord(String word) {
        words.getWords().add(word);
    }

    public int getSize() {
        return words.getWords().size();
    }

    public String getWord(int index) {
        return words.getWords().get(index);
    }

    public void removeWord(int index) {
        words.getWords().remove(index);
    }

    public boolean containsWord(String word) {
        return words.getWords().contains(word);
    }

}
