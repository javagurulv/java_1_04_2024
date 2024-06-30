package lv.javaguru.java1.student_deniss_boltunovs.lesson_10.map.homework.level_2;

public class AuthorSearchCriteria implements SearchCriteria {

        private String authorToSearch;

        public AuthorSearchCriteria(String authorToSearch) {
            this.authorToSearch = authorToSearch;
        }

        public boolean match(Book book) {
            String author = book.getAuthor();
            return author.equals(this.authorToSearch);
        }

}
