package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        String yearOfIssue = book.getYearOfIssue();
        return yearOfIssue.equals(this.yearOfIssueToSearch);
    }

}
