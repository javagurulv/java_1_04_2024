package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.list;

class WordArrayListService implements WordListService {

    private WordArrayList words;

    public WordArrayListService() {
        this.words = new WordArrayList();
    }

    @Override
    public void addWord(String word) {
        words.getWords().add(word);
    }

    @Override
    public int getSize() {
        return words.getWords().size();
    }

    @Override
    public String getWord(int index) {
        return words.getWords().get(index);
    }

    @Override
    public void removeWord(int index) {
        words.getWords().remove(index);
    }

    @Override
    public boolean containsWord(String word) {
        return words.getWords().contains(word);
    }

}
