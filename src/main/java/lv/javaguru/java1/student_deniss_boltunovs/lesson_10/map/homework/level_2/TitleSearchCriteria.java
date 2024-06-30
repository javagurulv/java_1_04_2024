package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        String title = book.getTitle();
        return title.equals(this.titleToSearch);
    }

}
