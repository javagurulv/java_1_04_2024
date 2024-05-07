package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_3_junior;

class Chapter {

    private String chapterTitle;
    private String chapterContent;

    public Chapter(String chapterTitle, String chapterContent){
        this.chapterTitle = chapterTitle;
        this.chapterContent = chapterContent;
    }

    public String getChapterTitle(){
        return this.chapterTitle;
    }

    public String getChapterContent(){
        return this.chapterContent;
    }


}
