package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_3_junior;

public class BookChapter {
    private String chapter;
    private String text;

    public BookChapter(String chapter, String text) {
        this.chapter = chapter;
        this.text = text;
    }

    public String getChapter() {
        return chapter;
    }

    public String getText() {
        return text;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public void setText(String text) {
        this.text = text;
    }
}
