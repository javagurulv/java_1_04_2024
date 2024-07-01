package lv.javaguru.java1.student_natalia_kochkina.lesson_10.homework.map.level_1;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

}
