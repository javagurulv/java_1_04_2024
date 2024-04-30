package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_3;

class Chapter {
    private String chapterName;
    private String text;

    Chapter(String chapterName, String text) {
        this.chapterName = chapterName;
        this.text = text;
    }

    String getChapterName() {
        return chapterName;
    }

    String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterName='" + chapterName + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
