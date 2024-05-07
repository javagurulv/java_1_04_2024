package lv.javaguru.java1.student_nikita_paramonovs.lesson_3;

public class chapter {
    private String title;
    private String text;

    public chapter(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
