package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
       return leftCondition.match(book) || rightCondition.match(book);
    }


}
